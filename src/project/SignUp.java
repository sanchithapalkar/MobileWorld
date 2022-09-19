package project;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class SignUp {
	@Test
  public  void signup() throws InterruptedException {
      // TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchitha.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
    
       Landingpage landingpage2 = new Landingpage(driver);
       landingpage2.goTo();
       landingpage2.signupapplication("virat","kohli","virat@gmail.com","virat123" ,"02/16/2000","9945828405","Welcome to Qualitest");
     
  }
}