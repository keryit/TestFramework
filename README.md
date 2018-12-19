# TestFramework

Maven project + TestNG + POM + Facade + Factory for WebDriver

## Project structure
   Class SitePages.java - facade pattern for initializing all pages from the site
   
   package *pages* - contains all pages from the site (each web page it's separate class)
   
   package *utils* - contains driver setUp classes, Listener class, SetUp class (setUp driver before running tests) and Constans (url, driver etc)
       
