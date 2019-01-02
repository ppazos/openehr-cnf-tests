cucumber {
   tags = ["~@ignore"]

   // https://github.com/hauner/grails-cucumber/wiki/Plugin-Guide#plugins-formatsformatters
   plugins = [
    	"json:target/test-reports/cucumber.json",
    	"html:target/test-reports/cucumber",
      "pretty:target/test-reports/cucumber-pretty",
      //"progress:target/test-reports/cucumber-progress",
      "default_summary:target/test-reports/cucumber-default_summary"
    ]
}
