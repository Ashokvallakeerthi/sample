package com.ebanking.masters;

public class Exelibrary {

	public static void main(String[] args) throws InterruptedException {
		Library lb=new Library();
		String l1=lb.openapp("http://primusbank.qedgetech.com/");
		System.out.println(l1);
		lb.adminlogin("Admin", "Admin");
		lb.branchcreation("Tubelight", "streetlight", "81397", "INDIA", "Andhra Pradesh", "Hyderabad");
		lb.rolecreation("sweeper", "E");
		lb.employecreation("Ashokkumar", "ashok12345", "clerk", "ameerpet");
		lb.logout();
		lb.close();

	}

}
