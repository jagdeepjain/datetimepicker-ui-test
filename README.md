datetimepicker-ui-automation
============================

Description
===========
This project will demonstrate ui automation of jquery ui datimetime picker using selenium webdriver and junit with google pageFactory support.

Getting The Code
================
```
git clone https://github.com/jagdeepjain/datetimepicker-ui-test.git
```

Pre-Requisite To Run Test
=========================
Assuming you have jdk 1.6 or later and maven installed.

Firefox browser version 36.1 or less.

Running Test
============
Execute below command from root directory.
```
mvn clean test
```
OR
```
mvn clean test -Dtest=<testName>
```

Running your test on Travis-CI with each commit
===============================================
```
https://travis-ci.org/jagdeepjain/datetimepicker-ui-test/
```

Benefits
========
1. User can pick dates and add to test according date and time will be picked up from calender.
2. Package has screenshot maker, if junit test fails this class will create a screen shot of the failure screen which you can look into target/surefire-reports folder.
3. Common package can be used as it is.
4. Writing page objects and tests is simple.
5. BaseTest class will set infrastructure for testing work.
6. Page object has services defined as methods which mocks the user.


