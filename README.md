datetimepicker-ui-automation
============================

Description
===========
This project will demonstrate ui automation of jquery ui datimetime picker using selenium webdriver and junit.

Getting The Code
================
```
git clone https://github.com/jagdeepjain/datetimepicker-ui-automation.git
```

Pre-Requisite To Run Test
=========================
Assuming you have jdk 1.6 or later and maven installed.

Running Test
============
Execute below command from root directory.
```
mvn clean test
```

Benefits
========
1. User can pick dates and add to test according date and time will be picked up from calender.
2. Package has screenshot maker, if junit test fails this class will create a screen shot of the failure screen which you can look into target/surefire-reports folder.
3. Common package can be used as it is.
4. Writing test is more easy as the framework is more structured.
5. BaseTest class will do all the repeatavtive work.
6. Less use of XPath make test robust and maintainable, better use XPath from final static constants, it helps in quickly fixing the problems if Xpaths gets change.

