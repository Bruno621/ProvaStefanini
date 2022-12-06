package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver){this.driver = driver;}
	
	String  ID_NOME      =  "xxxx";
	String  ID_EMAIL 	 = "yyyy";
	String  ID_SENHA 	 = "zzzz";
	String  ID_CONFIRMAR = "zzzz";
	
	
	public void login(String Usuario,String Email,String Senha) {
		
		driver.findElement(By.id(ID_NOME)).sendKeys(Usuario);
		driver.findElement(By.id(ID_EMAIL)).sendKeys(Email);
		driver.findElement(By.id(ID_SENHA)).sendKeys(Senha);
		driver.findElement(By.id(ID_CONFIRMAR)).click();
	}
	
	
	
}
