package mproj.FarmPickMavenProject;

import org.testng.annotations.Test;

import utility.Read;
import apps.Login;




public class Base {
	
	@Test
	public void start()
	{
		System.out.println("This is the base class");
		Login obj= new Login();
		obj.print();
		
		Read.print();
		
		
	}

}

