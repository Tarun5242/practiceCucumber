package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSteps {
	WebDriver driver;
	
	@Given("first you have to open browser")
	public void first_you_have_to_open_browser() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();   
	}
	
	@When("give amazon url")
	public void give_amazon_url() {
	   driver.get("https://www.amazon.in/");
	}

	@Then("search a prodct {string}")
	public void search_a_prodct(String ProductName) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ProductName + Keys.ENTER);
		
	
	}

	@And("print it price {int}")
	public void print_it_price(Integer price) {
	    System.out.println(price);
	}
	@Then("close browser bhai")
	public void close_browser_bhai() {
		driver.close();
	}

}
