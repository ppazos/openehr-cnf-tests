package test

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.Method.POST
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON

class I_DEFINITION_ADL14 {

   def method()
   {
      return "utils method!"
   }

   def list_all_opts()
   {
      println 'I_DEFINITION_ADL14.list_all_opts'

      // with http will redirect to https
      def http = new HTTPBuilder('https://rest.ehrscape.com')
      def path = '/rest/openehr/v1/definition/template/adl1.4'

      println path
      /*
      try
      {
         */
         http.request( GET ) {
            uri.path = path
            uri.query = [:]
            headers.Accept = 'application/json'
            headers.'Content-Type' = 'application/json'
            headers.Authorization = 'Basic Z3VpZGVtbzpndWk/IWRlbW8xMjM='
            //headers.Prefer = 'return=representation'

            response.success = { resp, json ->
               println json
               return json
            }

            response.failure = { resp, reader ->
               println resp
               println resp.statusLine
               //assert false
               throw new Exception(resp.statusLine.toString())
            }
         }
         /*
      }
      catch (Exception e)
      {
         println 'Exception: '+ e.getMessage()
         //assert false
      }
      */
   }
}
