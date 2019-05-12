package StepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dealsstepwithmapdefinition {
	
WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		}

	@When("^title of page is free crm$")
	public void title_of_page_is_free_crm(){
		String title = driver.getTitle();	
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable logincredentials){
		for(Map<String,String> values : logincredentials.asMaps(String.class, String.class)) {
		driver.findElement(By.name("username")) .sendKeys(values.get("username"));
	    driver.findElement(By.name("password")).sendKeys(values.get("password"));
		}	
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginbtn);
		}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String homepagetitle = driver.getTitle();
		Assert.assertEquals("CRMPRO", homepagetitle);
		}

	@Then("^user moves to deal page$")
	public void user_moves_to_deal_page(){
		driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	    driver.findElement(By.xpath("//a[text()='New Deal']")).click();
		}

	@And("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealstable){
		for (Map<String,String> dealvalues: dealstable.asMaps(String.class, String.class)){
		driver.findElement(By.id("title")).sendKeys(dealvalues.get("title"));
		driver.findElement(By.name("client_lookup")).clear();
		driver.findElement(By.name("client_lookup")).sendKeys(dealvalues.get("company"));
		driver.findElement(By.id("amount")).sendKeys(dealvalues.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(dealvalues.get("probability"));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save' ]")).click();
		Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	    driver.findElement(By.xpath("//a[text()='New Deal']")).click();

		}
	}

	@Then("^close the browser$")
	public void close_the_browser(){
		driver.quit();
		}

}
