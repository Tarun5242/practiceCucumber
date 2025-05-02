package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDemo2 {
    WebDriver driver;
	
	@Given("open chrome browser")
	public void open_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();	
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	    }

	@When("now give url")
	public void now_give_url() {
	   driver.get("http://admin-demo.nopcommerce.com/login");
	}

	@And("give correct details")
	public void give_correct_details() {
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
	}

	@Then("click on ok")
	public void click_on_ok() {
		 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@And("matched title")
	public void matched_title() {
	   if(driver.getPageSource().contains("Start accepting orders")) {
		   System.out.println("done");
		   Assert.assertTrue(true);
		   
	   }
	   else Assert.assertTrue(false);
	}
}
