package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundSteps {
     WebDriver driver;
	
	
	
	 @Before
	  public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	}
	    
	
	@Given("open orangeHrm login page")
	public void open_orange_hrm_login_page() {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


	@Then("enter username correctly")
	public void enter_username_correctly() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	}
	@And("enter password correctly")
	public void enter_password_correctly() {
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   
	}
	@Then("hit on login button")
	public void hit_on_login_button() {
	   driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	@And("click on add employee")
	public void click_on_add_employee() {
	    driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
	}

	@When("give first name")
	public void give_first_name() {
	  driver.findElement(By.name("firstName")).sendKeys("maputo");
	}

	@Then("give middle name name")
	public void give_middle_name_name() {
	    driver.findElement(By.name("middleName")).sendKeys(".....");
	}

	@And("give last name")
	public void give_last_name() throws InterruptedException {
	   driver.findElement(By.name("lastName")).sendKeys("don");
	   Thread.sleep(3000);
	}

	@Given("give emp id")
	public void give_emp_id() throws InterruptedException {
	  driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).clear();
	  driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("6543");
	  Thread.sleep(3000);
	}
	@After
	public void tearDown() {
		driver.close();
		
	}

	
}
