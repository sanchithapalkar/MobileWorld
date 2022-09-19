package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Contactus {
@Test


   public void ContactUs() throws InterruptedException{
        // TODO Auto-generated method stub
         
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchitha.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
            Thread.sleep(2000);
            Landingpage landingpage = new Landingpage(driver);
            landingpage.goTo();
            landingpage.Contactus();
            Thread.sleep(2000);



   }



}
