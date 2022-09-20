package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By Forgot = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");
	private By valCustomerLookup = By.xpath("//*[@id=\"rightPanel\"]/h1");
	private By Register = By.cssSelector("#loginPanel > p:nth-child(3) > a");
	private By valSigning = By.cssSelector("#rightPanel > h1");
	private By Name = By.id("customer.firstName");
	private By lastName = By.id("customer.lastName");
	private By Address = By.id("customer.address.street");
	private By City = By.id("customer.address.city");
	private By State = By.id("customer.address.state");
	private By zipCode = By.id("customer.address.zipCode");
	private By Phone  = By.id("customer.phoneNumber");
	private By SSN = By.xpath("//*[@id=\"customer.ssn\"]");
	private By Username = By.id("customer.username");
	private By Password = By.id("customer.password");
	private By Confirm = By.id("repeatedPassword");
	private By RegisterCadastro = By.xpath("//input[@value='Register']");
	private By findMyLogin = By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input");
	private By Name2 = By.id("firstName");
	private By lastName2 = By.id("lastName");
	private By Address2 = By.id("address.street");
	private By City2 = By.id("address.city");
	private By State2 = By.id("address.state");
	private By zipCode2 = By.id("address.zipCode");
	private By SSN2 = By.xpath("//*[@id=\"ssn\"]");
	private By validarTextoRegister = By.xpath("//h1[text()='Welcome AntonioLeonelrjr']");
	private By validarTextoForgot = By.xpath("//h1[text()='Welcome AntonioLeonelrjr']");
    private By PassWord = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    private By User = By.cssSelector("#loginPanel > form > div:nth-child(2) > input");
    private By Loginn = By.xpath("//input[@type='submit']");
    private By accountsOverview = By.xpath("//h1[text()='Accounts Overview']");
    
    public By getAccountsOverview() {
		return accountsOverview;
	}
    public By getLoginn() {
		return Loginn;
    }
    public By getUser() {
		return User;
	}
    public By getPassWord() {
		return PassWord;
	}
	public By getName2() {
		return Name2;
	}
	public By getLastName2() {
		return lastName2;
	}
	public By getAddress2() {
		return Address2;
	}
	public By getCity2() {
		return City2;
	}
	public By getState2() {
		return State2;
	}
	public By getZipCode2() {
		return zipCode2;
	}
	public By getSSN2() {
		return SSN2;
	}
	
	public By getFindMyLogin() {
		return findMyLogin;
	}
	public By getValidarTextoForgot() {
		return validarTextoForgot;
	}
	public By getValidarTextoRegister() {
		return validarTextoRegister;
	}
	public By getValCustomerLookup() {
		return valCustomerLookup;
	}
	public By getName() {
		return Name;
	}
	public By getLastName() {
		return lastName;
	}
	public By getAddress() {
		return Address;
	}
	public By getCity() {
		return City;
	}
	public By getState() {
		return State;
	}
	public By getZipCode() {
		return zipCode;
	}
	public By getPhone() {
		return Phone;
	}
	public By getSSN() {
		return SSN;
	}
	public By getUsername() {
		return Username;
	}
	public By getPassword() {
		return Password;
	}
	public By getConfirm() {
		return Confirm;
	}
	public By getRegisterCadastro() {
		return RegisterCadastro;
	}
	public By getValSigning() {
		return valSigning;
	}
	public By getForgot() {
		return Forgot;
	}
	public By getCustomerLookup() {
		return valCustomerLookup;
	}
	public By getRegister() {
		return Register;
	}
	}

