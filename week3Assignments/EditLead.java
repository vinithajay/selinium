package week3Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	     
	  public static void main(String[] args) throws InterruptedException {
		      WebDriverManager.chromedriver().setup(); 
			  ChromeDriver driver =new ChromeDriver();
			  driver.get("http://leaftaps.com/opentaps/control/main");
			  
			  driver.manage().window().maximize();
			  

			  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			  
			  driver.findElement(By.id("password")).sendKeys("crmsfa");
			  
			  driver.findElement(By.className("decorativeSubmit")).click();
			  
			  driver.findElement(By.linkText("CRM/SFA" )).click();
			  driver.findElement(By.linkText("Leads")).click();
			  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vinith");
			  driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
			  Thread.sleep(2000);
		      driver.findElement(By.linkText("16937")).click();
		      String title="View Lead";
		      String title1=driver.getTitle();
		      System.out.println(title1);
	          if (title1.contains(title)) {
				System.out.println("ViewLead created successfully");
			} else {
                System.out.println("ViewLead not created successfully");
			}
			  driver.findElement(By.xpath("(//a[@class='subMenuButton'][3])")).click();
			  driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
			  driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TATA Consultancy Service");
			  driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
			  String companyName="TATA Consultancy Service (16937)";
			  System.out.println(companyName);
			  String text=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
			  if (companyName.equals(text)) {
				System.out.println("company name is changed");
			} else {
                System.out.println("company name is not changed");
			}
	        driver.close();

}
}