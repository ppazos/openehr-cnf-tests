import cucumber.api.PendingException
import cucumber.api.DataTable

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.Method.POST
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON

import groovy.json.JsonBuilder

import java.util.logging.Logger

this.metaClass.mixin (cucumber.api.groovy.EN)
this.metaClass.mixin (cucumber.api.groovy.Hooks) // to be able to declare Before and After, without this we get an exception

// All these methods are wrapped into a OPT_steps class, everything declared in
// Before for "this" will be injected in that class.

Before () {

   println "Before OPT_ehr_scape_steps"

   //throw new Exception(this.getClass().toString()) //'OPT_ehr_scape_steps'

   this.log = Logger.getLogger(this.getClass().toString())

   this.shared2 = [:]

   // run export URL=https://rest.ehrscape.com
   // before running the tests to set the URL env!
   //println System.getenv('URL')

   this.url2 = 'http://rest.ehrscape.com/rest/openehr/v1'

   // service -> operation -> REST metadata {path, method}
   this.paths = [
      I_DEFINITION_ADL14: [
         list_all_opts: [
            'path': '/definition/template/adl1.4',
            'method': 'GET'
         ],
         get_opt: [
            'path': '/definition/template/adl1.4/{template_id}',
            'method': 'GET',
            'url_params': ['template_id']
         ],
         upload_opt: [
            'path': '/definition/template/adl1.4',
            'method': 'POST',
            'headers': [
              'Prefer': ['return=minimal', 'return=representation'] // EHRSCAPE only supports Prefer for the POST, IMO should be supported by other endpoints because of https://specifications.openehr.org/releases/ITS-REST/Release-1.0.0/definitions.html#representation-details-negotiation
             ],
            'body-type': ['application/xml'],
            'body': [
              'application/xml': ['template1.opt', 'template2.opt'] // sample templates in XML
            ]
         ],
         delete_opt: [], /* there is no delete on the REST API yet... */
         has_opt: [], /* this should be get_opt() != null, so it is like a post condition */
         count_opts: [] /* count is not yet part of the interface, raised a JIRA ticket https://openehr.atlassian.net/browse/SPECPR-288 */
      ]
   ]
}

After () {
   println "AFTER2"
   //this.shared2 = [:]
}

/*
def I_DEFINITION_ADL14_list_all_opts()
{
   println 'I_DEFINITION_ADL14_list_all_opts'
   println "url "+ this.url2
   def http = new HTTPBuilder(this.url2)
   def path = this.paths.I_DEFINITION_ADL14.list_all_opts.path
   println path
   try
   {
      http.request( GET ) {
         uri.path = path //this.paths.I_DEFINITION_ADL14.list_all_opts.path // this is not current class
         uri.query = [:]
         headers.Accept = 'application/json'
         headers.Authorization = 'Basic Z3VpZGVtbzpndWk/IWRlbW8xMjM='
         headers.Prefer = 'return=representation'

         response.success = { resp, json ->
            println json
            return json
         }

         response.failure = { resp, reader ->
            println resp
            println resp.statusLine
            //assert false
         }
      }
   }
   catch (Exception e)
   {
      println 'Exception: '+ e.getMessage()
      //assert false
   }
}

def I_DEFINITION_ADL14_get_opt()
{

}

def I_DEFINITION_ADL14_upload_opt()
{

}
*/

When(~/^the client lists the templates from EHRSCAPE$/) { ->

   println "A0!!!!"

   this.log.info "When the client lists the templates from EHRSCAPE"
   this.log.warning "warning"
   this.log.severe "severe"

   //this.shared2.opts = I_DEFINITION_ADL14_list_all_opts()

   /* cant get context says it is null, might need to add the bean to the resources
   def ctx = grails.util.Holders.grailsApplication.parentContext //mainContext
   def ehrScapeService = ctx.getBean ("ehrScapeService")
   */
   //def ehrScapeService = new test.EhrScapeService() // service still null!!!
   def utils = new test.I_DEFINITION_ADL14()

   //println ehrScapeService.method()

   //this.shared2.opts = ehrScapeService.I_DEFINITION_ADL14_list_all_opts()

   println "A "+ this.shared2

   this.shared2['opts'] = utils.list_all_opts()
}
Then(~/^there are many templates in EHRSCAPE$/) { ->
   println "B "+this.shared2

   assert this.shared2['opts'].size() > 0
}
