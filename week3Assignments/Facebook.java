package week3Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	   public static void main(String[] args) {
			  WebDriverManager.chromedriver().setup();
			  ChromeDriver driver =new ChromeDriver();
			  driver.get("https://en-gb.facebook.com/");
			  driver.manage().window().maximize();
			 
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			  
			  driver.findElement(By.linkText("Create New Account")).click();
			  
			  driver.findElement(By.name("firstname")).sendKeys("vinith");
			  
			  driver.findElement(By.name("lastname")).sendKeys("ajay");
			  
			  driver.findElement(By.name("reg_email__")).sendKeys("6379855540");
			  
			  driver.findElement(By.id("password_step_input")).sendKeys("tigerpuppy");
			  
			  WebElement Day = driver.findElement(By.name("birthday_day"));
			  Select day=new Select(Day);
			  day.selectByVisibleText("17");
			  
			  WebElement Month = driver.findElement(By.name("birthday_month"));
			  Select month=new Select(Month);
			  month.selectByVisibleText("Sep");
			  
			  WebElement Year = driver.findElement(By.id("year"));
			  Select year=new Select(Year);
			  year.selectByVisibleText("2000");
			  
			  driver.findElement(By.xpath("//input[@value='2']")).click();
		      
		      
		      
	   }
	    }
