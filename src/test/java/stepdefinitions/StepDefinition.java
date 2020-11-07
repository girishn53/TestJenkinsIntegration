package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StepDefinition {
	WebDriver driver;

	@Given("^I'm in first feature file$")
	public void i_m_in_first_feature_file() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://isango.com/");
		
		System.out.println("Title is "+driver.getTitle());

		
		driver.close();
		
	}

	@Given("^I'm in second feature file$")
	public void i_m_in_second_feature_file() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Title is "+driver.getTitle());
		driver.close();
	}
	
	
	
	@Given("^I'm in third feature file$")
	public void i_m_in_third_feature_file() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.udemy.com/");
		
		System.out.println("Title is "+driver.getTitle());
		driver.close();
	}
}
