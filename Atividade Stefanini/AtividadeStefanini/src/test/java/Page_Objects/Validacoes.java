package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validacoes {

WebDriver driver;
	
	public Validacoes(WebDriver driver){this.driver = driver;}
	
	public String  ID_TelaCarregada =  "xxxx";
	public String  ID_Descricao     =  "yyyy";
	public String  ID_COnfirmacao   =  "zzzz";
	
	public void VerificaCarregamentoTela() {driver.findElement(By.id(ID_TelaCarregada)).isDisplayed();}
	
	
	//............................................................................................................
	
    public String VerificaTexto(String ID_Elemento)   {
    	
    	String TXT ="";
    	if(driver.findElement(By.id(ID_Elemento)).isDisplayed()) {
    		
    		TXT = driver.findElement(By.id(ID_Elemento)).getText();	
    	}
		return TXT;
    	}
    //..............................................................................................................	
    	    


}
