package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoBusca = By.xpath("//input[normalize-space()='']");
    private By BtnLupa = By.xpath("/html/body/div[4]/div/div[1]/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/label/div/span/div/button");	

	public By getBtnLupa() {
		return BtnLupa;
	}

	public By getCampoBusca() {
		return campoBusca;
	}

}
