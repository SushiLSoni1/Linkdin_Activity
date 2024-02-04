package demo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Poston_Linkdin {
    ChromeDriver driver;

    public Poston_Linkdin()
    {
        System.out.println("Constructor: Poston_Linkdin");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    public void Poston_Linkdin() throws InterruptedException, AWTException {
    System.out.println("Start Test case: Poston_Linkdin");
    //Navigate to "https://www.linkedin.com/"
    driver.get("https://www.linkedin.com/");
    //Click on "Sign in" by using xpath "//a[@class='nav__button-secondary btn-md btn-secondary-emphasis']"
    driver.findElement(By.xpath("//a[@class='nav__button-secondary btn-md btn-secondary-emphasis']")).click();
    //Enter username "sushilsoni16@gmail.com" by using id "username"
    WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("sushilsoni16@gmail.com");
    //Enter password "8887660065" by using id "password"
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("8887660065");
    //Click on "Sign in" by using xpath "//button[contains(text(),'Sign in')]"
    driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    //Click on "Profile" by using xpath "(//div[@class='display-flex align-items-baseline'])[1]"
    WebElement Profile = driver.findElement(By.xpath("(//div[@class='display-flex align-items-baseline'])[1]"));
    //Print the profile name on console
        System.out.println(Profile.getText());
        //Click on "Impressions" by using xpath "(//div[@class='display-flex align-items-baseline'])[2]"
        WebElement Impression = driver.findElement(By.xpath("(//div[@class='display-flex align-items-baseline'])[2]"));
    //Print the impression on console
        System.out.println(Impression.getText());
    //Click on "Share" by using xpath "//div[@class='share-box-feed-entry__top-bar']"
    Thread.sleep(4000); 
          //click on post by using "//div[@class='share-box-feed-entry__top-bar']"
      driver.findElement(By.xpath("//div[@class='share-box-feed-entry__top-bar']")).click();
         //sleep for 4 seconds
          Thread.sleep(4000);
         //Click on "Add media" by using xpath "(//button[@aria-label=\"Add media\"])[1]"
      driver.findElement(By.xpath("(//button[@aria-label=\"Add media\"])[1]")).click();
         //sleep for 4 seconds
   Thread.sleep(4000);
   //Create robot object 
    Robot robot = new  Robot();
    // set filepath as C:\Users\SUSHIL\Pictures\Screenshots\Screenshot 2024-01-09 163505.png
    StringSelection filepath = new StringSelection("\"C:\\Users\\SUSHIL\\Pictures\\Screenshots\\Screenshot 2024-01-09 163505.png\"");
   // setcontecnts of clipboard as filepath
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
    //Press control
    robot.keyPress(KeyEvent.VK_CONTROL);
    //thread sleep for 4 seconds
    Thread.sleep(4000);
    //Press V
    robot.keyPress(KeyEvent.VK_V);
    //release control
    robot.keyRelease(KeyEvent.VK_CONTROL);
    //press enter
    robot.keyPress(KeyEvent.VK_ENTER);
    // release enter
    robot.keyRelease(KeyEvent.VK_ENTER);
    //sleep for 4 seconds
    Thread.sleep(4000);
    //Click on "Next" by using xpath "(//div[@class='share-box-footer__main-actions']//button)[2]"
    driver.findElement(By.xpath("(//div[@class='share-box-footer__main-actions']//button)[2]")).click();
    //sleep for 4 seconds
    Thread.sleep(4000);
    //Click on "Post" by using xpath "//button[@class='share-actions__primary-action artdeco-button artdeco-button--2 artdeco-button--primary ember-view']//span[text()='Post']"
    driver.findElement(By.xpath("//button[@class='share-actions__primary-action artdeco-button artdeco-button--2 artdeco-button--primary ember-view']//span[text()='Post']")).click();
    //sleep for 4 seconds
    Thread.sleep(4000);
    //Find the Status by using xpath "//div[@class='artdeco-toast-item__content']"
    WebElement Status = driver.findElement(By.xpath("//div[@class='artdeco-toast-item__content']"));
    //Print the Status on console
    System.out.println("Status of post --> ="+Status.getText());
  }

}