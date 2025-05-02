package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CerMethod1 {
	public WebDriver driver;
	
	@Given("open chrome")
	public void open_chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tarun\\Desktop\\Seljar\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
		Thread.sleep(2000);
	   
	}

	@When("give url {string}")
	public void give_url(String st) {
	    driver.get(st);
	}

	@Then("search {string}")
	public void search(String str) throws InterruptedException {
	   driver.findElement(By.id("search")).sendKeys(str);
	   Thread.sleep(500000);
	}

	@And("click on search")
	public void click_on_search() {
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	   
	}


}
