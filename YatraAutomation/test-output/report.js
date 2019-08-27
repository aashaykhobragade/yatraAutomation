$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelJaipurUC1.feature");
formatter.feature({
  "line": 2,
  "name": "yatra.com validations",
  "description": "",
  "id": "yatra.com-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "yatra.com Use case1 scenarios",
  "description": "",
  "id": "yatra.com-validations;yatra.com-use-case1-scenarios",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is already on yatra.com page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Hotels",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User selects city as Jaipur",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User selects Checkin and Checkout dates",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects Travellers",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Clicks Search Hotels button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Print Total number of Hotel records",
  "keyword": "Then "
});
formatter.match({
  "location": "hoteljaipurUC.user_is_already_on_yatra_com_page()"
});
formatter.result({
  "duration": 7384395304,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_clicks_on_Hotels()"
});
formatter.result({
  "duration": 132603944,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_selects_city_as_Jaipur()"
});
formatter.result({
  "duration": 17338463704,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_selects_Checkin_and_Checkout_dates()"
});
formatter.result({
  "duration": 13133014314,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_selects_Travellers()"
});
formatter.result({
  "duration": 5324683935,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.clicks_Search_Hotels_button()"
});
formatter.result({
  "duration": 1426600554,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.Print_Total_number_of_Hotel_records()"
});
formatter.result({
  "duration": 5136629736,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "yatra.com Use case2 scenarios",
  "description": "",
  "id": "yatra.com-validations;yatra.com-use-case2-scenarios",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@End2EndTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User Selects Star rating as 5 Star",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User Selects bottom of top 5 hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User clicks Hotel and Print the price",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Clicks on review tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User choose room button and click on book now",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Verify the same price and hotel name",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Verify the tariff details",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "hoteljaipurUC.User_Selects_Star_rating_as_5_Star()"
});
formatter.result({
  "duration": 5306346818,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_Selects_bottom_of_top_5_hotel()"
});
formatter.result({
  "duration": 5168524445,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_clicks_Hotel_and_Print_the_price()"
});
formatter.result({
  "duration": 6461693263,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_Clicks_on_review_tab()"
});
formatter.result({
  "duration": 75886351,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_choose_room_button_and_click_on_book_now()"
});
formatter.result({
  "duration": 6929844720,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_Verify_the_same_price_and_hotel_name()"
});
formatter.result({
  "duration": 33237709,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.user_Verify_the_tariff_details()"
});
formatter.result({
  "duration": 80056092,
  "status": "passed"
});
formatter.match({
  "location": "hoteljaipurUC.close_the_browser()"
});
formatter.result({
  "duration": 647579556,
  "status": "passed"
});
});