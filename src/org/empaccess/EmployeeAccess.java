package org.empaccess;

import org.access.AdminAccess;
import org.access.ClientAccess;

public class EmployeeAccess extends AdminAccess{

	public void access3(String name, int number) {
		System.out.println("admin name is "+name+"\n"+"admin ID is "+number);
	
}
	public static void main(String[] args) {
		
		EmployeeAccess data = new EmployeeAccess();
		
		data.access3("Suresh", 401742);
		data.access2("Andrew", 10);
		data.access2("ravi");
		
	}
}
