package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.models.Register;

public class RegisterPage extends Page {
	public By linkRegister = By.linkText("Register");
	By txtFirstName = By.id("customer.firstName");
	By txtLastName = By.id("customer.lastName");
	By txtAddress = By.id("customer.address.street");
	By txtCity = By.id("customer.address.city");
	By txtState = By.id("customer.address.state");
	By txtZipCode = By.id("customer.address.zipCode");
	By txtPhone = By.id("customer.phoneNumber");
	By txtSsn = By.id("customer.ssn");
	By txtUserName = By.id("customer.username");
	By txtPassword = By.id("customer.password");
	By txtConfirm = By.id("repeatedPassword");
	By btnRegister= By.xpath("//td/input[@class='button']");

	public RegisterPage(WebDriver dr) {
		super(dr);
	}

	
	    public void inputData(Register register) {
	        testBase.inputText(txtFirstName, register.firstName, 0);
	        testBase.inputText(txtLastName, register.lastName, 0);
	        testBase.inputText(txtAddress, register.address, 0);
	        testBase.inputText(txtCity, register.city, 0);
	        testBase.inputText(txtState, register.state, 0);
	        testBase.inputText(txtZipCode, register.zipCode, 0);
	        testBase.inputText(txtPhone, register.phone, 0);
	        testBase.inputText(txtSsn, register.sSN, 0);
	        testBase.inputText(txtUserName, register.userame, 0);
	        testBase.inputText(txtPassword, register.password, 0);
	        testBase.inputText(txtConfirm, register.confirm, 0);
	        testBase.clickToElement(btnRegister, 0);
	    }


	

}
