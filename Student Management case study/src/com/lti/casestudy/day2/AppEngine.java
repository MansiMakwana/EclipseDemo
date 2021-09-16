package com.lti.casestudy.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.lti.casestudy.day1.Course;
import com.lti.casestudy.day1.Student;

public class AppEngine {
	Student studentData[];
	Course courseData[];
	Enroll enrollments[];
	
	
	
	public AppEngine()
	{
		studentData=new Student[2];
		courseData=new Course[2];
		enrollments=new Enroll[2];
	}

	


	public void introduce(Course course)
	{
		for(int i=0;i<courseData.length;i++)
		{
			courseData[i]=course;
		}
		
		
	}
	
	
	public void register(Student student) 
	{
		for(int i=0;i<studentData.length;i++)
		{
			studentData[i]=student;
		}
    }
	
	public void enroll(Student student,Course course)
	{
		for(int i=0;i<enrollments.length;i++)
		{
//			List list = new ArrayList(Arrays.asList(student)); //returns a list view of an array  
//			//returns a list view of str2 and adds all elements of str2 into list  
//			list.addAll(Arrays.asList(str2));     
//			Object[] str3 = list.toArray();         //converting list to array  
//			System.out.println(Arrays.toString(str3));  //prints the resultant array  
		}
	}
}
