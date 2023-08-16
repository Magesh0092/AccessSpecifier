package org.access;

public class AdminAccess {

	public void access2(String name, int number) {
		System.out.println("admin name is "+name+"\n"+"admin ID is "+number);
	

	}
	public void access2(String name) {
		System.out.println("client name is "+name);
		
	}
public static void main(String[] args) {
	
AdminAccess data = new AdminAccess();
data.access2("kk", 55);
data.access2("ll");	
	
}
}