package com.ebanking.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {
	WebDriver driver;
	String expval,actval;
	public String openapp(String url){
		//launching primus bank
				String expval="Primus Bank";
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				String actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
				if (expval.equalsIgnoreCase(actval)) {
					System.out.println("primus bank homepage is displayed");
					
				}
				else{
					System.out.println("primus bank homepage is not displayed");
				}
				return "pass";
	}
	public void adminlogin(String un,String pwd){
		//admin login
				expval="Welcome to Admin";
				driver.findElement(By.id("txtuId")).sendKeys(un);
				driver.findElement(By.id("txtPword")).sendKeys(pwd);
				driver.findElement(By.id("login")).click();
				actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
				if (expval.equalsIgnoreCase(actval)) {
					System.out.println("admin home page is diplayed");
					
				}
				else
				{
					System.out.println("admin home page is not diplayed");
				}
	}
	public void branchcreation(String branchname,String address,String zipcode,String country,String state,String city){
		expval="Sucessfully";
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
        driver.findElement(By.id("BtnNewBR")).click();
        driver.findElement(By.id("txtbName")).sendKeys(branchname);
        driver.findElement(By.id("txtAdd1")).sendKeys(address);
        driver.findElement(By.id("txtZip")).sendKeys(zipcode);
        Select s1=new Select(driver.findElement(By.id("lst_counrtyU")));
        s1.selectByVisibleText(country);
        Select s2=new Select(driver.findElement(By.id("lst_stateI")));
        s2.selectByVisibleText(state);
        Select s3=new Select(driver.findElement(By.id("lst_cityI")));
        s3.selectByVisibleText(city);
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
	}
	public void rolecreation(String rolename,String roletype){
		 //rolecreation
        expval="Sucessfully";
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
        driver.findElement(By.id("btnRoles")).click();
        driver.findElement(By.id("txtRname")).sendKeys(rolename);
        Select s4=new Select(driver.findElement(By.id("lstRtypeN")));
        s4.selectByVisibleText(roletype);
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
	}
	public void employecreation(String employename,String loginpassword,String role,String branch) throws InterruptedException{
		  //employecreartion
        expval="Successfully";
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
        driver.findElement(By.id("BtnNew")).click();
        driver.findElement(By.id("txtUname")).sendKeys(employename);
        driver.findElement(By.id("txtLpwd")).sendKeys(loginpassword);
        Select s5=new Select(driver.findElement(By.id("lst_Roles")));
        s5.selectByVisibleText(role);
        Select s6=new Select(driver.findElement(By.id("lst_Branch")));
        s6.selectByVisibleText(branch);
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
	}
	public void logout(){
		 //logout
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
	}
	public void close(){
		//close
        driver.close();
	}

}
