package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepsDemo  {
	public WebDriver driver;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();   
	}
	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}
	@And("user enter Emal {string} and password as {string}")
	public void user_enter_emal_and_password_as(String username, String password) {
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}
	@And("click on login")
	public void click_on_login() {
       driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title1) {
        if(driver.getTitle().equalsIgnoreCase(title1)) {
        	System.out.println("successfully login");
        	Assert.assertTrue(true);
        }
        else 
        	Assert.assertTrue(false);
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

	}
	@Then("title should be {string}")
	public void title_should_be(String title2) {
		  if(driver.getTitle().equalsIgnoreCase(title2)) {
			  System.out.println("successfully logout");
	        	Assert.assertTrue(true);
	        }
	        else 
	        	Assert.assertTrue(false);
		
	}

	@And("close browser")
	public void close_browser() {
       driver.close();
	}
}
