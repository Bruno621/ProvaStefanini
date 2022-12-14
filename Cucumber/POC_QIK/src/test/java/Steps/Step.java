package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class Step {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {


		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.globo.com");
		
		
		throw new io.cucumber.java.PendingException();
	}

}
