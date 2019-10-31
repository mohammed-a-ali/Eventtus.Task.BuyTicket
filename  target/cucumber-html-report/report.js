$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/BuyFreeTicket.feature");
formatter.feature({
  "name": "Buying a free ticket",
  "description": "  I want to check that registered user can buy a free ticket",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buy a free ticket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.I_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered the user data",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.i_entered_the_user_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displays successfully",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displays_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open \"Test Automation Event\" event",
  "keyword": "When "
});
formatter.match({
  "location": "BuyTicket.IOpenEvent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Get Tickets\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BuyTicket.IClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Register button",
  "keyword": "And "
});
formatter.match({
  "location": "BuyTicket.IClicksRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Fill ticket details",
  "keyword": "And "
});
formatter.match({
  "location": "BuyTicket.iSelectFillTicketDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order confirmation appears",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyTicket.orderConfirmationAppears()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"//h2[@class\u003d\u0027confirmation__title\u0027]\"}\n  (Session info: chrome\u003d78.0.3904.70)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-TO67BV2\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.70, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\kaiba\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49983}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 75d54d3cff3d1db5b2a45a8c95cdf211\n*** Element info: {Using\u003dlink text, value\u003d//h2[@class\u003d\u0027confirmation__title\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\r\n\tat pages.BuyingTicketCompleted.orderConfirmation(BuyingTicketCompleted.java:19)\r\n\tat steps.BuyTicket.orderConfirmationAppears(BuyTicket.java:57)\r\n\tat ✽.Order confirmation appears(file:src/test/java/features/BuyFreeTicket.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I log out",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.ILogOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/features/UserLogin.feature");
formatter.feature({
  "name": "User Login",
  "description": "  I want to check that the user can login to Eventtus website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.I_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered the login data",
  "keyword": "When "
});
formatter.match({
  "location": "UserLogin.iEnteredTheLoginData()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#user_login\"}\n  (Session info: chrome\u003d78.0.3904.70)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-TO67BV2\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.70, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\kaiba\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49983}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 75d54d3cff3d1db5b2a45a8c95cdf211\n*** Element info: {Using\u003did, value\u003duser_login}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy24.sendKeys(Unknown Source)\r\n\tat pages.PageBase.setTextElementText(PageBase.java:27)\r\n\tat pages.HomePage.login(HomePage.java:32)\r\n\tat steps.UserLogin.iEnteredTheLoginData(UserLogin.java:23)\r\n\tat ✽.I entered the login data(file:src/test/java/features/UserLogin.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.IamLoggedIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I log out",
  "keyword": "And "
});
formatter.match({
  "location": "UserLogin.ILogOut()"
});
formatter.result({
  "status": "skipped"
});
});