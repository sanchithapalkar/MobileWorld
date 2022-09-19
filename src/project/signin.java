package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class signin {
@Test




  public  void Signin() throws InterruptedException {
	
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchitha.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //driver.get("https://mobileworld.banyanpro.com/");
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.signinapplication("virat","virat@gmail.com");
        Thread.sleep(1000);





  }





}