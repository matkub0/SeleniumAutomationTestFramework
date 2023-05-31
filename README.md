# Selenium test framework for Swag Labs

A project created to develop your skills and build a portfolio of automated tests.

## Configuration
If the tests are fired locally, the paths to the *.exe files on disk (chromedriver.exe, IEDriverServer.exe, etc.) must be provided in the configuration.properties file  for example:

```bash
  chrome.driver.location=C:/drivers/chromedriver.exe
  firefox.driver.location=C:/drivers/geckodriver.exe
```
and set is.remote.run to false.

To run test on selenium grid enter the url on which selenium grid is running and for is.remote.run set the value to true

To select the browser on which the tests will be launched, set the value for browser for example:
```bash
  browser=chrome
```

## Running tests from the command line

Navigate to the directory where the project is located.

For example
```bash
  cd C:\Users\IdeaProjects\SeleniumAutomationTestFramework
```
Calling the command by specifying the path to the XML file containing the test suite

```bash
  mvn clean test -Dsurefire.suiteXmlFiles=src\test\resources\all_test_suite.xml
```
Calling the command will:

Deleting the /target/ folder in the project

Run and execute tests (test)

Creation of a simple test report in the directory of the \target\surefire-reports



https://github.com/matkub0/SeleniumAutomationTestFramework/assets/109211934/6a51d8f2-4052-4e99-bc77-4ca6fb9a3eec




After completing the tests, to generate a report call 

```bash
  mvn allure:report
```
Example report: 

![image](https://github.com/matkub0/SeleniumAutomationTestFramework/assets/109211934/8df628bc-44ab-46cf-b57f-b649bd6430dd)





