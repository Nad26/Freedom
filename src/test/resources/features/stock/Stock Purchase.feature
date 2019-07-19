Feature: Stock Purchase

  Background:
    Given User has made an order
    And   The order is accepted
    When  The order is sent out for a delivery date
    Then  The delivery options: Receive Stock, Items Not on Site & Supplier Interface are available



@tc:54
  Scenario: Engineer's received stock is available to use
	
    When Engineer clicks Receive Stock 
	And  Engineer clicks Receive All items 
    Then The stock item is available in Engineer's stock list
	And  The stock Admin does not receive a mail


@tc:55
  Scenario: Engineer's received consumables are available to use

    When Engineer clicks Receive Stock 
	And  The delivery contains consumables
	And  Engineer clicks Receive All items 
    Then The stock item is available in Engineer's consumables list
	And  The stock Admin does not receive a mail

@tc:56
  Scenario: Engineer's received tools are available to use

    When Engineer clicks Receive Stock 
	And  The delivery contains tools
	And  Engineer clicks Receive All items 
    Then The stock item is available in Engineer's tools list
	And  The stock Admin does not receive a mail


@tc:57
Scenario: Stock reception with a comment

    When Engineer clicks Receive Stock 
	And  Engineer adds 1 or more comments
	And  Engineer clicks Receive All items 
    Then The stock item is available in Engineer's tools list


@tc:58
 Scenario: Email not received by Stock Admin when 0 stock received

	Given A stock has already been recorded Not On Site twice
	When Engineer clicks Receive Stock
	And  The engineer update the number of items to 0
	And  Engineer clicks Receive All items 
	Then The action is not recorded
    And  The Stock Order Items Not On-site mail is not received by the stock Admin

	
@tc:59
 Scenario: Email not received by Stock Admin when part stock received

	Given A stock has already been recorded Not On Site twice
	When  Engineer clicks Receive Stock
	And   The engineer unselect some of the items 
	Then  The button 'Receive selected items' is displayed
	When  The Engineer clicks 'Receive selected items'
	Then  The ticked items are marked as received
    And   The Stock Order Items Not On-site mail is not received by the stock Admin


@tc:60
  Scenario: Email received by Stock Admin for 2 or more recorded Items Not on Site

	Given A stock has already been recorded Not On Site twice
	When  Engineer clicks Items Not On Site 
    Then  The Stock Order Items Not On-site mail is received by the stock Admin

	
@tc:61
  Scenario: The count of Not on Site report is accurate 

	Given A stock order has been registered Not on site and the mail received by the stock admin
	When  The stock admin opens the mail
    Then  The number of time the stock has been reported Not on Site is displayed in red

	
@tc:62
  Scenario: Order details sent in mail are accurate 

	Given A stock admin is on the Order Items Not On-site mail
	When  The stock admin clicks on View Order
    Then  The order is opened
	And   The order status is displayed as Awaiting Confirmation
	

@tc:63
Scenario: Engineer is unable to receive items if none selected

	When Engineer clicks Receive Stock
	And  No items are checked 
	Then The 'Receive All items' button is no longer available
	
