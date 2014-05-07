datetimepicker-ui-automation
============================

Description
===========
This project will show how ui automation of jquery ui datimetime picker using selenium webdriver can be done.

Getting The Code
================
```
git clone https://github.com/jagdeepjain/datetimepicker-ui-automation.git
```

Pre-Requisite To Run Test
=========================
Assuming you have jdk install 1.6 or later, maven installation is required to run test.

Running Test
============
Navigate to datetimepicker-ui-automation directory and execute below command.
```
mvn clean test
```

Benefits
========
1. User can pick dates and add to test according date and time will be picked up from calender.
2. Package has screenshot maker, if junit test fails this class will create a screen shot of the failure screen which you can look into target/surefire-reports folder.
3. Common package can be used as it is.
4. Test is more structured and any QA who does not no much of Java can also write test.
5. BaseTest class will do all the repeatavtive work.
6. Less use of XPath make test robust and maintainable, better use XPath from final static constants, it helps in quickly fixing the problems if Xpaths gets change.

TODO
====
Bifurcating common package into a standalone project
