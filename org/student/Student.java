package org.student;

import org.department.Department;

public class Student extends Department{
        
	   public void  studentName() {
		   System.out.println("Vinith N");
	}
	   public void studentDept() {
		System.out.println("Civil Engineering");
	}
	   public void studentId() {
		System.out.println("041");
	} 
	   
	   public static void main(String[] args) {
		  Student education=new Student();
		  education.collegeName();
		  education.collegeCode();
		  education.collegeRank();
		  education.deptName();
		  education.studentName();
		  education.studentDept();
		  education.studentId();
	}
}
