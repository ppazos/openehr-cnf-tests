package test

import grails.transaction.Transactional

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.Method.POST
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON

@Transactional
class EhrScapeService {

   def method()
   {
      throw new Exception('pocholo')
      return "tha method"
   }

/*
   def I_DEFINITION_ADL14_list_all_opts()
   {
      println 'I_DEFINITION_ADL14_list_all_opts'

      def http = new HTTPBuilder('http://rest.ehrscape.com/rest/openehr/v1')
      def path = '/definition/template/adl1.4'

      println path
      try
      {
         http.request( GET ) {
            uri.path = path
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
   */
}
