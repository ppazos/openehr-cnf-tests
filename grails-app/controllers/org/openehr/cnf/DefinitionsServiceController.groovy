package org.openehr.cnf

import grails.converters.JSON

class DefinitionsServiceController {

   // memory smulator
   static opts = [:]

   def upload_opt()
   {
      def opt = request.JSON
      opts[opt.template_id] = opt
      render ([created: 'ok'] as JSON)
   }

   def has_opt(String template_id)
   {
      render ([result: opts[template_id] != null] as JSON)
   }

   def count_opts()
   {
      render ([count: opts.size()] as JSON)
   }

   def get_opt(String template_id)
   {
      render (opts[template_id] as JSON)
   }

   def list_all()
   {
      render (opts as JSON)
   }

   def clean()
   {
      opts.clear()
      render ([cleaned: 'ok'] as JSON)
   }
}
