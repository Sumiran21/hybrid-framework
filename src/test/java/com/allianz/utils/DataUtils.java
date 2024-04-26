package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] invalidloginData(){
		
		
		 Object [][] data= new Object[2][3];
		 data[0][0]="john";
		 data[0][1]="john123";
		 data[0][2]="Invalid credentials";
		 data[1][0]="saul";
		 data[1][1]="saul123";
		 data[1][2]="Invalid credentials";
			
		 return data;	
	}
	

	@DataProvider
	public Object[][] validloginData(){
		
		
		 Object [][] data= new Object[1][3];
		 data[0][0]="admin";
		 data[0][1]="admin123";
		 data[0][2]="Dashboard";
		 
			
		 return data;	
	}

}
