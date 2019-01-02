import cucumber.api.PendingException
import cucumber.api.DataTable

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.Method.POST
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON

import groovy.json.JsonBuilder

this.metaClass.mixin (cucumber.api.groovy.EN)
this.metaClass.mixin (cucumber.api.groovy.Hooks) // to be able to declare Before and After, without this we get an exception

// All these methods are wrapped into a OPT_steps class, everything declared in
// Before for "this" will be injected in that class.

Before () {

println "Before OPT_steps"

   this.shared = [:]

   // does not change with --app.server.url=xxxx when running the tests
   //println grails.util.Holders.config.app.server.url

   // run export URL=https://rest.ehrscape.com
   // before running the tests to set the URL env!
   //println System.getenv('URL')

   this.url = 'http://localhost:8080'

   println this.url
}

After () {

}

// FIXME: server URL should be configurable, maybe by a parameter for test-app

// TODO: move to service, should be used like def bookService = appCtx.getBean ("bookService")
def upload_opt(opt_id)
{
   def http = new HTTPBuilder(this.url)

   def jb = new JsonBuilder()
   jb {
      template_id opt_id
      archetype_id 'openEHR-EHR-COMPOSITION.test.v1'
   }

   try
   {
      http.request( POST ) {
         uri.path = '/openehr-cnf-tests/definitionsService/upload_opt'
         uri.query = [:]
         send JSON, jb.toString()
         headers.Accept = 'application/json'
         //headers.Authorization = 'Bearer '+ api_key // FIXME: get from config

         response.success = { resp, json ->
            //println "POST Success: ${resp.statusLine}" // POST Success: HTTP/1.1 200 OK
            //println resp.statusLine.statusCode // 200
            //println json.getClass() // class net.sf.json.JSONArray
            //println json // [created: 'ok']

            assert json.created == 'ok'
         }

         // FIXME: log correctly
         // FIXME: throw exception based on status like 429 Too Many Requests, etc.
         response.failure = { resp, reader ->
            println 'request failed'
            println resp
            println resp.statusLine
            println resp.status
            println reader.text

            assert false
         }
      }
   }
   catch (Exception e)
   {
      println e
      println e.getMessage()
      assert false
   }
}

def count_opts()
{
   def http = new HTTPBuilder(this.url)

   def count

   try
   {
      http.request( GET ) {
         uri.path = '/openehr-cnf-tests/definitionsService/count_opts'
         uri.query = [:]
         headers.Accept = 'application/json'

         response.success = { resp, json ->
            //println json // [count:0]
            count = json.count
         }

         // FIXME: log correctly
         // FIXME: throw exception based on status like 429 Too Many Requests, etc.
         response.failure = { resp, reader ->
            println 'request failed'
            println resp
            println resp.statusLine
            println resp.status
            println reader.text

            assert false
         }
      }
   }
   catch (Exception e)
   {
      println e.getMessage()
      assert false
   }

   return count
}

Given(~/^server is running$/) { ->

   println this.url

   def http = new HTTPBuilder(this.url)

   try
   {
      http.request( POST ) {
         uri.path = '/'
         uri.query = [:]
         headers.Accept = 'text/html'

         response.success = { resp, html ->
            assert true
         }

         // even if the reponse is 40x the server is online
         // not sure about 50x yet
         response.failure = { resp, reader ->
            assert true
         }
      }
   }
   catch (Exception e)
   {
      assert false
   }
}

Given(~/^current count of OPTs is (\d+)$/) { int arg1 ->

   assert count_opts() == arg1
}

When(~/^the client uploads an OPT to the I_DEFINITION_ADL14 with template_id "([^"]*)"$/) { String template_id ->

   upload_opt(template_id)
}

Then(~/^the OPT "([^"]*)" is available from the I_DEFINITION_ADL14$/) { String template_id ->

   def http = new HTTPBuilder(this.url)

   try
   {
      http.request( POST ) {
         uri.path = '/openehr-cnf-tests/definitionsService/has_opt'
         uri.query = [template_id: template_id]
         headers.Accept = 'application/json'

         response.success = { resp, json ->
            //println json // [result:true]

            assert json.result == true
         }

         // FIXME: log correctly
         // FIXME: throw exception based on status like 429 Too Many Requests, etc.
         response.failure = { resp, reader ->
            println 'request failed'
            println resp
            println resp.statusLine
            println resp.status
            println reader.text

            assert false
         }
      }
   }
   catch (Exception e)
   {
      println e.getMessage()
      assert false
   }
}

When(~/^the client uploads to the I_DEFINITION_ADL14 an OPT with template id in:$/) { DataTable template_ids ->

   List template_ids_list = template_ids.asList(String.class)

   template_ids_list.each { tid ->
      upload_opt(tid)
   }
}

Given(~/^current count of OPTs is N by induction$/) { ->

   this.shared.n = count_opts()
}

Then(~/^current count of OPTs is N\+(\d+) by induction$/) { int m ->

   assert count_opts() == this.shared.n + m
}
