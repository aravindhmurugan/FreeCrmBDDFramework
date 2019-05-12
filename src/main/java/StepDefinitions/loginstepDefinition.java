//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert; 
//
//public class loginstepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_is_on_login_page() {
//	System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.get("https://classic.crmpro.com");
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//	String title = driver.getTitle();	
//	Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//	
////	@Then("^user enters user name and password$")
////	public void user_enters_user_name_and_password(){
////    driver.findElement(By.name("username")) .sendKeys("aravindhmurugan");
////    driver.findElement(By.name("password")).sendKeys("welcome1");
////	}
//	
////	Reg Exp:
////	1. \"([^\"]*)\"
////	2. \"(.*)\"
//	
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_user_name_and_password(String username, String password){
//    driver.findElement(By.name("username")) .sendKeys(username);
//    driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
//	JavascriptExecutor js =  (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click()", loginbtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page(){
//	String homepagetitle = driver.getTitle();
//	Assert.assertEquals("CRMPRO", homepagetitle);
//	}
//	
//	@Then("^user clicks on new contact page$")
//	public void user_clicks_on_new_contact_page(){
//	driver.switchTo().frame("mainpanel");
//    Actions action = new Actions(driver);
//    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//    driver.findElement(By.xpath("//a[text()='New Contact']")).click();
//	}
//
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String firstname, String lastname, String position){
//	driver.findElement(By.id("first_name")).sendKeys(firstname);
//	driver.findElement(By.id("surname")).sendKeys(lastname);
//	driver.findElement(By.id("company_position")).sendKeys(position);
//	driver.findElement(By.xpath("//input[@type='submit' and @value='Save' ]")).click();
//	}
//
//	@And("^close the browser$")
//	public void Close_the_browser() {
//		driver.quit();
//	}
// 
//}
