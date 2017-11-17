package manage;

import com.webtest.core.WebDriverEngine;

public class LoginClass {
	
    public WebDriverEngine webtest;
    public String name;
    public String password;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassWord(String password) {
		this.password = password;
	}
	
	public LoginClass(WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }
	public void inputValuesSeccess(String name,String password) {
		webtest.open("http://localhost:8032/MyMovie/admin.php");

		webtest.type("name=username", name);
		webtest.type("name=password", password);
		webtest.click("xpath=//input[@type='submit']");
		
	}
	
	
}