package Onlineshoppings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveractions {

	
		//WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"))).build().perform();
//		
//		act.moveToElement(driver.findElement(By.id("container"))).click();
		
		
		//act.moveToElement(driver.findElement(By.xpath("//*[@id="container"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[7]/a"))).click();
		//act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"))).build().perform();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[4]/div/div")).click();
		
		public static void main(String[] args) throws InterruptedException
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\Santhosh\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Sleeper.sleepTightInSeconds(7);
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		//Sleeper.sleepTightInSeconds(4);
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a/b"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.id("menu_leave_Reports"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveBalanceReport']")).click();
	}

}
