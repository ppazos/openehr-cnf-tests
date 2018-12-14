import org.codehaus.groovy.grails.test.support.GrailsTestRequestEnvironmentInterceptor

this.metaClass.mixin (cucumber.api.groovy.Hooks)

GrailsTestRequestEnvironmentInterceptor scenarioInterceptor

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.Method.POST
import static groovyx.net.http.ContentType.JSON

Before () {
   //scenarioInterceptor = new GrailsTestRequestEnvironmentInterceptor (appCtx)
   //scenarioInterceptor.init ()
}

After () {
   //scenarioInterceptor.destroy ()
   def http = new HTTPBuilder('http://localhost:8080')

   try
   {
      http.request( POST ) {
         uri.path = '/openehr-cnf-tests/definitionsService/clean'
         uri.query = [:]
         //send URLENC, [query: snomedExpr]
         headers.Accept = 'application/json'
         //headers.Authorization = 'Bearer '+ api_key // FIXME: get from config

         response.success = { resp, json ->
            //println "POST Success: ${resp.statusLine}" // POST Success: HTTP/1.1 200 OK
            //println resp.statusLine.statusCode // 200
            //println json.getClass() // class net.sf.json.JSONArray
            //println json // [count:0]

            assert json.cleaned == 'ok'
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
