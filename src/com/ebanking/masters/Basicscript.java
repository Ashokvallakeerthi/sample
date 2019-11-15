package com.ebanking.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException {
		//launching primus bank
		String expval="Primus Bank";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		String actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if (expval.equalsIgnoreCase(actval)) {
			System.out.println("primus bank homepage is displayed");
			
		}
		else{
			System.out.println("primus bank homepage is not displayed");
		}
		//admin login
		expval="Welcome to Admin";
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		if (expval.equalsIgnoreCase(actval)) {
			System.out.println("admin home page is diplayed");
			
		}
		else
		{
			System.out.println("admin home page is not diplayed");
		}
		//branchcreation
		expval="Sucessfully";
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
        driver.findElement(By.id("BtnNewBR")).click();
        driver.findElement(By.id("txtbName")).sendKeys("SyfefkefhS");
        driver.findElement(By.id("txtAdd1")).sendKeys("sdgheorihgi");
        driver.findElement(By.id("txtZip")).sendKeys("58946");
        Select s1=new Select(driver.findElement(By.id("lst_counrtyU")));
        s1.selectByVisibleText("INDIA");
        Select s2=new Select(driver.findElement(By.id("lst_stateI")));
        s2.selectByVisibleText("Andhra Pradesh");
        Select s3=new Select(driver.findElement(By.id("lst_cityI")));
        s3.selectByVisibleText("Hyderabad");
        driver.findElement(By.id("btn_insert")).click();
        actval=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        if (actval.contains(expval)) {
        	System.out.println("branch created");
			
		}
        else{
        	System.out.println("branch already exist");
        }
        //return to home
        driver.findElement(By.xpath("/html/body/form/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
        //rolecreation
        expval="Sucessfully";
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
        driver.findElement(By.id("btnRoles")).click();
        driver.findElement(By.id("txtRname")).sendKeys("Manager");
        Select s4=new Select(driver.findElement(By.id("lstRtypeN")));
        s4.selectByVisibleText("E");
        driver.findElement(By.id("btninsert")).click();
        actval=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        if (actval.contains(expval)) {
        	System.out.println("role created");
			
		}
        else{
        	System.out.println("role already exist");
        }
        //return to home
        driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
        //employecreartion
        expval="Successfully";
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
        driver.findElement(By.id("BtnNew")).click();
        driver.findElement(By.id("txtUname")).sendKeys("Narendramodiji");
        driver.findElement(By.id("txtLpwd")).sendKeys("741852963");
        Select s5=new Select(driver.findElement(By.id("lst_Roles")));
        s5.selectByVisibleText("Teller");
        Select s6=new Select(driver.findElement(By.id("lst_Branch")));
        s6.selectByVisibleText("ameerpet");
        driver.findElement(By.id("BtnSubmit")).click();
        actval=driver.switchTo().alert().getText();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        if (actval.contains(expval)) {
        	System.out.println("employe created");
			
		}
        else{
        	System.out.println("employe already exist");
        }
      //return to home
        driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
        //logout
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
        //close
        driver.close();
        
        
        
        
        




        
        
	}

}
