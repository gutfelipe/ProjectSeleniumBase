package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarAreaLogin() {
		clicarBotao("lnkLoginHeader");
	}
	
	public void informarLogin(String login) {
		escrever("text-e-mail", login);
	}

	public void informarSenha(String senha) {
		escrever("password-senha", senha);
	}
	
	public void clicarEmEntrar() {
		clicarBotao(By.cssSelector("button.btn-primary"));
	}
	
}
