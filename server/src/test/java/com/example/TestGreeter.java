package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  
 /* public void douitest()
  {
	   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTest\\ChromeDriver\\Chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8090/samplemaven/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Assert.assertTrue(driver.getPageSource().contains("Recoreded"));
		//input[@type="button"]
		
  }*/

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
