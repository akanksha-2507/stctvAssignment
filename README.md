# Selenium Cucumber Framework for STCTV

---

## Project Objective
This project is a sample automation test framework that uses Selenium and Cucumber with Java as the programming language.

---

## Tools and Libraries
Two primary tools used in this project are Selenium and Cucumber.
The complete list of tools, you can see in the `pom.xml` file.

## Requirements
* Java Development Kit 11
* Maven(command line installation)


## Running Tests
* Clone the repository from the repo to this directory
* Open the project using any Java IDE
* Run the tests with the script below
```shell
$ mvn clean install
```
* If you want to run the specific test, use the cucumber tags like this
```shell
$ mvn clean install -Dcucumber.filter.tags="@REPLACE_WITH_ANY_TAGS_THAT_YOU_WANT"
```

## Test Results
* Test report automatically generated on `target` folder after finished the test execution
* View test report from `target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html`
* You can also share your Cucumber test report with another person at https://reports.cucumber.io, just go to `src/test/resources/cucumber.properties` then change the value to be `true`
```properties
cucumber.publish.enabled=true
```

---
