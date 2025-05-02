package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksStep {
    WebDriver driver;
    WebElement ssrch=null;;
    
    
    @Before("@Smoke")// this is hooks and this method will run before all the scenarios in this Feature those have tag @Smoke
    public void setting() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    }
    
	@Given("give your Logindetails")
	public void give_your_logindetails() {
	    driver.get("http://admin-demo.nopcommerce.com/login");
	}

	@When("Click on Ok after successfull detalis")
	public void click_on_ok_after_successfull_detalis() {
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@Then("match Title for home Page")
	public void match_title_for_home_page() {
		 if(driver.getPageSource().contains("Start accepting orders")) {
			   System.out.println("done");
			   Assert.assertTrue(true);
			   
		   }
		   else Assert.assertTrue(false);
	
	}

	@Then("hit on logout butten")
	public void hit_on_logout_butten() {
	  
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	@After   //this is hooks and this method will run after all the scenarios in this Feature
	public void tearDown() {
		driver.quit();
	}
   
	
	@Before("@Regression")
	 public void setting2() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    }

   @Given("go to search option")
   public void go_to_search_option() {
   WebElement ssrch=driver.findElement(By.id("nav-search-bar-form"));
   this.ssrch=ssrch;
   }
   @When("search product {string}")
   public void search_product (String pn) {
	   ssrch.sendKeys(pn);
	   ssrch.sendKeys(Keys.ENTER);
   }

    @Then("get page title")
    public void get_page_title() {
    System.out.println(driver.getTitle());
  }
}
