package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public By linkRegister = By.linkText("Register");

	public HomePage(WebDriver dr) {
		super(dr);
	}

	public RegisterPage clickOnRegisterLink() {

		driverWeb.findElement(linkRegister).click();
		return new RegisterPage(driverWeb);
	}
}
