package gitfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sthuthy G S\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.facebook.com");
	    driver.findElement(By.name("email")).sendKeys("Sthu");
	    driver.findElement(By.name("pass")).sendKeys("Sthu123");
	    driver.findElement(By.name("login")).click();
	    

	}

}
