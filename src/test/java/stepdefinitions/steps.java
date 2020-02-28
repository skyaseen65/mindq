package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pompages.clsamazon;

public class steps
{
//	public WebDriver driver;
//	public clsamazon obj;
//
//	@Given("user launch chrome browser")
//	public void user_launch_chrome_browser()
//	{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
//		driver=new ChromeDriver();
//		obj=new clsamazon(driver);
//	}
//
//	@When("user opens url {string}")
//	public void user_opens_url(String url) throws InterruptedException
//	{
//		driver.get(url);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//	}
//
//	@When("user click on Signin button")
//	public void user_click_on_Signin_button()
//	{
//		obj.clickSignin();
//	}
//
//	@When("user enter email as {string}")
//	public void user_enter_email_as(String email) 
//	{
//		obj.setEmail(email);
//	}
//
//	@When("user click on continue button")
//	public void user_click_on_continue_button() 
//	{
//		obj.clickContinue();
//	}
//
//	@When("user enter password as {string}")
//	public void user_enter_password_as(String pwd) 
//	{
//		obj.setPassword(pwd);
//	}
//
//	@When("user click on Login button")
//	public void user_click_on_Login_button()
//	{
//		obj.clickLogin();
//	}
//
//	@Then("Page url should be {string}")
//	public void page_url_should_be(String acturl)
//	{
//		String pageurl=driver.getCurrentUrl();
//		Assert.assertEquals(pageurl, acturl);
//	}
}
