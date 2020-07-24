package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileInputStreamUtil;
import com.montran.util.FileOutputStreamUtil;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		FileOutputStreamUtil outpututil = new FileOutputStreamUtil();
		FileInputStreamUtil inpututil=new FileInputStreamUtil();
		String filePath;
		String empNo;
		int empId;
		int salary;
		String empSalary;
		String name;
		File file;
		byte[] fileData;
		
	
		System.out.println("Enter Path");
		filePath = scanner.next();
		file = new File(filePath);

		
		System.out.println("Enter Employee No : ");
		empId=scanner.nextInt();
		empNo=Integer.toString(empId);
		System.out.println("Enter name : ");
		name=scanner.next();
		System.out.println("Enter Employee Salary : ");
		salary=scanner.nextInt();
		empSalary=Integer.toString(salary);
		
		outpututil.writeDataIntoFile(file,empNo.getBytes());
		
		outpututil.writeDataIntoFile(file,empSalary.getBytes());
		
		outpututil.writeDataIntoFile(file,name.getBytes());
		
		System.out.println("Please check your file !!");
		
		//--------------------------------read from file------------------------
		
		System.out.println("Enter path of file");
		filePath=scanner.next();
		
		fileData=inpututil.getfileData(file);
		
		System.out.println("data from file :");
		for (byte b:fileData)
		{
			System.out.print((char) b);
		}
		
		
	}
}



	


