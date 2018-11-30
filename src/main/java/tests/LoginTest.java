package tests;

import org.junit.Test;

import core.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	private LoginPage loginPage = new LoginPage();
	
	@Test
	public void login() {
		loginPage.acessarAreaLogin();
		loginPage.informarLogin("pichu@mailinator.com");
		loginPage.informarSenha("123456");
		loginPage.clicarEmEntrar();
	}

}
