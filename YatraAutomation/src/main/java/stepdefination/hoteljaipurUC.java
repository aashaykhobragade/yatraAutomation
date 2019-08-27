package stepdefination;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public  class hoteljaipurUC{
	
	public static WebDriver driver;
	
	PropertiesFileReader obj= new PropertiesFileReader();
	
	
	@Given("^User is already on yatra.com page$")
	public void user_is_already_on_yatra_com_page() throws Throwable  {
	    
		    Properties properties = obj.getProperty(); 
		    System.setProperty("webdriver.chrome.driver", "C://Users//ABHISHEK//Downloads//selenium-java-3.141.59//Chrome//chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.get(properties.getProperty("browser.baseURL"));
		    System.out.println("User is on ::" + driver.getTitle() + " ::successfully ");
		
    }

	 @Then("^User clicks on Hotels$")
	     public void user_clicks_on_Hotels() {
		  driver.findElement(By.id("booking_engine_hotels")).click();
		  System.out.println("User clicks on Hotels successfully");

	}

	@Then("^User selects city as Jaipur$")
	      public void user_selects_city_as_Jaipur() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@type='text' and @id='BE_hotel_destination_city']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@class='required_field ac_input hotel_destInput origin_ac']")).sendKeys("Jaipur");
		  
		  Thread.sleep(7000);
		  
		  driver.findElement(By.xpath("//*[contains(@class,'viewport')]//div/div/div[2]/li")).click();
		  System.out.println("User selects on Hotel City successfully");
  
	}

	@Then("^User selects Checkin and Checkout dates$")
	public static void user_selects_Checkin_and_Checkout_dates() throws InterruptedException  {
		
	     driver.findElement(By.className("BE_hotel_checkin_date")).click();
	     
	     Thread.sleep(3000);
	     List<WebElement> dates= driver.findElements(By.xpath("//div[@class='cal-body BE_hotel_checkin_date']/div[1]"));
	     int total_node= dates.size();
	     for(int i=0; i<total_node; i++){
	    	String date = dates.get(i).getText();
	    	 
	    	if(date.equals("Wednesday, 28 August 2019"))
	    	{
	    	dates.get(i).click();
	    	break;
	     }
	    	driver.findElement(By.className("cal-body BE_hotel_checkout_date")).click();
	    	
	    	List<WebElement> dates1= driver.findElements(By.xpath("//div[@class='body-left BE_hotel_checkout_date']/div[1]"));
		     int total_node1= dates1.size();
		     for(int j=0; j<total_node1; j++){
		    	String date1 = dates1.get(j).getText();
		    	 
		    	if(date.equals("Friday, 30 August 2019"))
		    	{
		    	dates.get(j).click();
		    	break;
	    	
		    	}
	    	
		    	}
	    	
		 System.out.println("User selects on Check-in,Check-out date successfully");
	     }
	}

	@Then("^User selects Travellers$")
	public void user_selects_Travellers() throws InterruptedException  {
	    
		
		driver.findElement(By.xpath("//*[contains(@class,'hotel_passengerBox dflex relative')]//div//i[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='hotel_passengerBox dflex relative']//div[3]//div[1]//div[1]//span[2]")).click();
		
		Select AgeofChild = new Select(driver.findElement(By.xpath("//*[contains(@class,'ageselect')]//div//select")));
		AgeofChild.selectByValue("4");
		
		System.out.println("User selects Travellers successfully");
		
	}

	@Then("^Clicks Search Hotels button$")
	public void clicks_Search_Hotels_button() {
	    
		driver.findElement(By.xpath("//input[@id='BE_hotel_htsearch_btn']")).click();
		
		System.out.println("User Clicks Search Hotels Button successfully");
	
	}

	@Then("^Print Total number of Hotel records$")
	public void Print_Total_number_of_Hotel_records() throws InterruptedException{
		
		//Closing the popup
		driver.findElement(By.xpath("//*[contains(@class,'overlay-body animate')]//div//img[@ng-src='//css.yatracdn.com/content/"
				+ "globalcdn/bongo-cdn/images/hotel/Yatra-Smart_Desktop.jpg']")).click();
		
		Thread.sleep(5000);
		for(WebElement title: driver.findElements(By.xpath("//p[@class='matrix-label uprcse ng-binding']//span")))
		
			System.out.println("Total number of records of “Hotels” are::" + title.getText());

	  }
	
	@Given("^User Selects Star rating as 5 Star$")
	public void User_Selects_Star_rating_as_5_Star() throws InterruptedException  {
	
	driver.findElement(By.xpath("//aside[@id='filters']//ul[@class='start-rating-filter tabs txt-ac full']//li[5]//label[1]")).click();
		
	Thread.sleep(5000);
	
	for(WebElement title: driver.findElements(By.xpath("//p[@class='matrix-label uprcse ng-binding']//span")))
		
		System.out.println("Total number of records of 5 Star rating Hotels are::" + title.getText());
	
  }
	@Then("^User Selects bottom of top 5 hotel$")
	public void user_Selects_bottom_of_top_5_hotel() throws InterruptedException {
		Thread.sleep(5000);  
        System.out.println("List of bottom 5 hotel are :::");
		int count =0;
		
		for(WebElement title: driver.findElements(By.xpath("//a[@href='javascript:void(0)' and @class='under-link ng-binding']")))
		{ 
			if(count>24){
				System.out.println(title.getText()); 
			}
			count++; 
		}
		
	}

	@Then("^User clicks Hotel and Print the price$")
	public void user_clicks_Hotel_and_Print_the_price() throws InterruptedException  {
	   
		driver.findElement(By.xpath("//a[@href='javascript:void(0)' and @class='under-link ng-binding']")).click();
		Thread.sleep(5000);
		
		String mainWindowHandle = driver.getWindowHandle();
		Set <String> handles = driver.getWindowHandles();
		
		for(String h : handles ){
			//switch to new window
			driver.switchTo().window(h);
		}
	
		WebElement title =driver.findElement(By.xpath("//p[@class='full fm-lb fs-28 ng-binding']"));
			
			System.out.println("Price of the hotel is:" + title.getText());
		
	}

	@Then("^User Clicks on review tab$")
	public void user_Clicks_on_review_tab()  {
		
		//driver.findElement(By.xpath("//a[@id='viewid-review']")).click();
		
		for(WebElement title: driver.findElements(By.xpath("//li[@class='active']//ul[@class='list right-list full']")))
			
			System.out.println("All the reviews by Customers are::" + title.getText());
	    
	}

	@When("^User choose room button and click on book now$")
	public void user_choose_room_button_and_click_on_book_now() throws InterruptedException {
	
	 driver.findElement(By.xpath("//span[@id='choose-room-disable' and @class='fr btn new-blue-button']")).click();
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//li[@id='roomWrapper0000693995']//button[contains(@class,'choose-room-button')][contains(text(),'Book Now')]")).click();
	  Thread.sleep(3000);
	}

	@Then("^User Verify the same price and hotel name$")
	

	public void user_Verify_the_same_price_and_hotel_name()  {
		
	driver.findElement(By.xpath("//span[@class='fs-18 gray-dark text-truncate ng-binding']")).equals("Shakun Hotels and Resorts");
	
		
	}

	@Then("^User Verify the tariff details$")
	public void user_Verify_the_tariff_details()  {
	    
        for(WebElement title: driver.findElements(By.xpath("//aside[@id='rightBox']//div[contains(@class,'box-content hide-under-overlay aside-box-content pd-btm-0')]")))
		System.out.println("Hotel Charges , Hotel GST, You Pay are below " + title.getText());
 
     }
	 @Then("^Close the browser$")
		public void close_the_browser()  {
			driver.quit();
	    
	  }
	 
}
	
	
	
	
