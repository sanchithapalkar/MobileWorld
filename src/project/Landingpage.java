package project;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;









public class Landingpage {
    
    WebDriver driver;
    
    public Landingpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //WebElement myName = driver.findElement(By.id("myName"));
    
    
    //PageFactor
    //SignUp
    @FindBy(xpath="//*[text()='SIGN IN']")
    WebElement signin;
    
    @FindBy(css="a[href='signup.html']")
    WebElement signup;
    
    @FindBy(id="myName")
    WebElement firstname;
    
    @FindBy(css="input[placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(css="input[placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(css="input[placeholder='Password']")
    WebElement singuppassword;
    
    @FindBy(css="input[type='date']")
    WebElement date;
    
    @FindBy(css="div[class='col-md-2'] input[name='gender']")
    WebElement gender;
    
    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
    WebElement mobile;
    
    @FindBy(css="textarea[placeholder='Short Bio']")
    WebElement shortbio;
    
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement register;
    
    //Signin  
    @FindBy(id="username")
    WebElement username;
    
    @FindBy(id="password")
    WebElement signinpassword;
    
    @FindBy(css="a[type='submit']")
    WebElement submit;
    
    //ContactUS
    @FindBy(linkText="Support")
    WebElement support;
    
    @FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Contact Us']")
    WebElement contactus;
    
    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement cusername;
    
    @FindBy(css="input[placeholder='Email']")
    WebElement cemail;
    
    @FindBy(css="input[placeholder='Phone']")
    WebElement cphone;
    
    @FindBy(css="textarea[placeholder='Message']")
    WebElement cmessage;
    
    @FindBy(css="input[value='Send']")
    WebElement send;
    
    //action
    public void goTo()
    {
        driver.get("https://mobileworld.banyanpro.com/");
    }
    
    
//    public void goTo2()
//    {
//        driver.get("https://mobileworld.azurewebsites.net/contact.html");
//    }
    
    
    public void signinapplication(String name,String pwd)
    {
        signin.click();
        username.sendKeys(name);
        signinpassword.sendKeys(pwd);
        submit.click();
    }
    public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio)
    {
        signin.click();
        signup.click();
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(mail);
        singuppassword.sendKeys(uppwd);
        date.sendKeys(dob);
        gender.click();
        mobile.sendKeys(phone);
        shortbio.sendKeys(bio);
        register.click();
        Alert alert = driver.switchTo().alert(); // switch to alert
        alert.accept();
    }
    public void Contactus()
    {
        support.click();
        contactus.click();
        String parenthandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if(!handle.equals(parenthandle)) {
                driver.switchTo().window(handle);
                driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("virat");
                driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("virat@gmail.com");
                driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("8197714844");
                driver.findElement(By.cssSelector("textarea[placeholder='Message']")).sendKeys("asdfg");
                driver.findElement(By.cssSelector("input[type='submit']")).click();
            }
        
        }
    }
}