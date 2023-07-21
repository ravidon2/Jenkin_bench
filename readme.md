# Assignment Suite 

The following project demonstrate a list of test cases for amazon e commerce web application designed with the help automation tools.


Languages Used - Java 

Automation Tools - Selenium, TestNg  


## Packages Description

pageObjects: Describe a test pages consisting of all elements under test using page object model frameworks.

testCases: Describe a test cases for the given application under tests.

utilities: Describe Utility Class that can be reusable.

base: Describe the driver and logger setup.

###Pages and Test files Used

***dynamicdataPage and TC_DynamicDataTest

***TrainingPage and TC_TrainingTest

***RegisterPage and TC_RegisterTest
                          
***addtobasketPage and TC_AddToBasket

***filedownloadPage and TC_FileDownloadTest

***youtubevideoPage and TC_YouTubeVideoTest

***testcasePage and TC_TestCaseTest

***itemclickPage and TC_ItemChooseTest

***loginPage and TC_LoginTest

***BaseClass


###BaseClass

- @BeforeClass -  driver instances .
- @AfterClass - End browser session .





## Starred Directories

- Screenshots Folder : ./Failed_Screenshots/testmethodname.jpeg
- Properties  Folder: ./Configuration/config.properties
- Current_test_results folder: ./Current_test_results/ddmmyyyyhhmmss.html



## config.properties file 

- Url : URL of Site
- chromedriverProperty : driver used
- implicit wait



###Reports

- Extent report gets generated after the run under ./Current_test_results/Report.html

- TestNG report as "emailable-report.html" gets generated under \test-output

###Run Project

- click on Test.bat file 


