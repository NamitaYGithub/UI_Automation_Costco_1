# Getting started with Costco UI Automation Project

This project uses serenity framework for UI Automation. You can find information about framework
in file README_SERENITY_FRAMEWORK.md located at root of the project.

This project tests two UI features of costco.co.uk website.

## Important instruction about web drivers 

This project is developed and tested on latest Chrome browser. Before starting tests 
please download chrome drivers for your operating system and copy in webdriver folder.

You can download chrome drivers for your version of chrome and OS from below page :

https://sites.google.com/chromium.org/driver/downloads

## Github link for this project :

Git:

    git clone https://github.com/NamitaYGithub/Costco_UI_Automation.git
    

### The project directory structure :
The project has Maven build script, and follows the standard directory structure :
```Gherkin
src
  + main
    + java
      + uk.co.costco.automation.ui 
        + pages                      Class files for individual pages
        + utility                    Supporting utility classes        
  + test
    + java                           Test runners and supporting code
      + uk.co.costco.automation.ui   
        + stepdefinitions            Step definition files for features
        + testsuite                   Test runner
    + resources
      + features                      Feature files
      + webdriver                     Bundled webdriver binaries
        + linux
        + mac
        + windows
```

## Executing the tests

To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn clean verify` from the command line.

If you want to run individual feature, Right click feature file and select `Run : Feature `

The test results will be recorded in the `target/site/serenity`   directory.
