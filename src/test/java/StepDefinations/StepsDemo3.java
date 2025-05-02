package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDemo3 {
	WebDriver driver;
	
	
	
	@Given("open chrome driver")
	public void open_chrome_driver() {
		 WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();	
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@Then("give {string} and search")
	public void give_url_and_search(String abc) {
		 driver.get(abc);
	}

	@When("^give login Details(.*)and(.*)$")
	public void give_login_details_jack_and_jack123(String username , String password) throws InterruptedException {
	   driver.findElement(By.id("name")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   Thread.sleep(2000);
	}
	// can be written like this
	@When("give login Details{string}and{string}")
	public void give_login_details(String username , String password) throws InterruptedException {
	   driver.findElement(By.id("name")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   Thread.sleep(2000);
	}

	@Then("click on ok button")
	public void click_on_ok_button() {
	  driver.findElement(By.id("login")).click();
	}

	@And("title checked matched")
	public void title_checked_matched() {
	    
	}

	@Then("click on logout button")
	public void click_on_logout_button() {
	   if(driver.getTitle().equalsIgnoreCase("TestProject Demo")) {
		   Assert.assertTrue(true);
		   
	   }
	   else Assert.assertTrue(false);
	}

}
