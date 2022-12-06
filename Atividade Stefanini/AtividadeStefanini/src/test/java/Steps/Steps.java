package Steps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Objects.Login;
import Page_Objects.Validacoes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;

public class Steps {

	WebDriver driver;

	@Before
	public void before() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Quando("Acessar :{string}")
	public void acessar(String URl) throws InterruptedException {
		driver.get(URl);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		throw new io.cucumber.java.PendingException();
	}

	@Dado("Tela Carregada")
	public void tela_carregada() {

	Validacoes valida = new Validacoes(driver);
	valida.VerificaCarregamentoTela();
	throw new io.cucumber.java.PendingException();
	}

	@Dado("Verifica Descrição :{string}")
	public void verifica_descrição(String Texto) {
    
	Validacoes valida = new Validacoes(driver);
    
	assertArrayEquals(Texto, valida.VerificaTexto(valida.ID_Descricao));
	
	throw new io.cucumber.java.PendingException();
	}

	@Dado("Preenche :{string},{string},{string}")
	public void preenche(String Nome, String Email, String Senha) {

		Login l = new Login(driver);
		l.login(Nome, Email, Senha);
		throw new io.cucumber.java.PendingException();
	}

	@Dado("Verifica Mensagem de Confirmação:{string}")
	public void verifica_mensagem_de_confirmação(String Texto) {

		Validacoes valida = new Validacoes(driver);
		assertArrayEquals(Texto, valida.VerificaTexto(valida.ID_COnfirmacao));
		throw new io.cucumber.java.PendingException();
	}

	@After
	public void After() {driver.quit();}


}
