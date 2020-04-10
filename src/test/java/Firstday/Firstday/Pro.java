package Firstday.Firstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;

public class Pro {
	
	public static WebDriver driver;
	

@Given("^: open url \"([^\"]*)\"$")
public void open_url(String arg1) throws Throwable {
    System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\eclipse\\geckodriver.exe");
    driver=new FirefoxDriver();
    driver.get(arg1);
    driver.manage().window().maximize();
    Thread.sleep(8000);

}

@Then("^click find our more$")
public void click_find_our_more() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  WebElement btn= driver.findElement(By.className("offer-listing__btn"));
  		btn.click();
}

}