$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/flipkart.feature");
formatter.feature({
  "name": "Flipkart search test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "product search functionality test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch the chrome browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user opens url \"https://www.flipkart.com\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user provides username as \"9985183883\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter password as \"skyaseen701\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click  on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "page url should be \"https://flipkart.com\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});