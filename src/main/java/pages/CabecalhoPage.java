package pages;

import core.BasePage;
import core.DriverFactory;

public class CabecalhoPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://www.zapimoveis.com.br/");
	}

}
