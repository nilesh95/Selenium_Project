import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver; 
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\nilnayal\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // And now use this to visit Google
		 driver.navigate().to("https://academia.srmuniv.ac.in/accounts/signin?_sh=false&hideidp=true&portal=10002227248&client_portal=true&servicename=ZohoCreator&serviceurl=https://academia.srmuniv.ac.in/&service_language=en");
		 
		 driver.manage().window().maximize();
	        // Alternatively the same thing can be done like this
	        // driver.navigate().to("http://www.google.com");
		
	        // Find the text input element by its name
	       driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("Enter your email");
	       
	       driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("Enter your password");
	       //Enter the user name and password 
	      // Thread.sleep(5000);
	       Thread.sleep(5000);
	       driver.findElement(By.xpath(".//*[@id='signinForm']/div[5]/input")).click();
	       Thread.sleep(10000);
	       driver.navigate().forward();
	       
	       Thread.sleep(5000);
	      
	       driver.navigate().to("https://academia.srmuniv.ac.in/#View:My_Attendance");
	       
String value=driver.findElement(By.xpath(".//*[@id='zc-viewcontainer_My_Attendance']/div/div[4]/div[1]/table[2]/tbody/tr[2]/td[9]")).getText();
	       
	       System.out.println("The val is "+value);

	      

	   
	       (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.findElement(By.xpath(".//*[@id='zc-header-right']/table/tbody/tr/td[4]/a")).getText().contains("nilesh");
	            }
	        });
	       
	       System.out.println(driver.getCurrentUrl());
	        driver.quit();
	}

}
