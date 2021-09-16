package com.lti.casestudy.day1;

import java.util.Scanner;

public class App {
	
	public void scenario1()
	{
		Student s=new Student(1,"Mansi","25th jan 1999");
		s.setCollegeName("SPIT");
		Info i=new Info();
		i.display(s);
	}
	
	
	
	public void scenario2()
	{
		
		Student s[] =new Student[2];
		String phoneNo1[]=new String[2];
		phoneNo1[0]="983846384";
		s[0]=new Student(1,"Mansi","25th apr 1999",phoneNo1);
		
		String phoneNo2[]=new String[2];
		phoneNo2[0]="99277237329";
		phoneNo2[1]="364538r4324";
		s[1]=new Student(2,"ria","25th apr 1999",phoneNo2);
		
		Info i=new Info();
		for(int j=0;j<s.length;j++)
		{
			i.display(s[j]);
		}
		
	}
	
	public void scenario3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of Students data you want to enter");
		int sNo=sc.nextInt();
		for(int i=0;i<sNo;i++)
		{
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter DOB: ");
			String dob=sc.nextLine();
			
			System.out.println("How many phone numbers you want to enter: ");
			int p=sc.nextInt();
			sc.nextLine();
			
			
			String phoneNo[]=new String[p];
			for(int j=0;j<p;j++)
			{
				System.out.println("Enter phone number: ");
				phoneNo[j]=sc.nextLine();
			}
			
			Student s=new Student(id,name,dob,phoneNo);
			
			Info k=new Info();
			k.display(s);
		}
	}
	
public static void main(String[] args) {
	App a=new App();
	//a.scenario1();
	//a.scenario2();
	a.scenario3();
	
	
	
	
}
}
