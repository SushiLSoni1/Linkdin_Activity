/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.awt.AWTException;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException, AWTException {
        
        // This is to remove unnecessary warnings from your console
        System.setProperty("java.util.logging.config.file", "logging.properties");
        
     
       Poston_Linkdin testLink = new Poston_Linkdin();          // Initialize your Poston_Linkdin class
   
    
        //TODO: call your test case functions one after other here


          testLink.Poston_Linkdin();
         


        //END Tests

       

        testLink.endTest();              //End your test by clearning connections and closing browse
       

    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException, AWTException {
        new App().getGreeting();
    }
    
}