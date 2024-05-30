package org.stud;
//METHOD OVERLOADING

public class Student {
     //datatype
	public void studentInfo(String name) {
		System.out.println("MY NAME IS:"+name);
	}
	//datatype count
	public void studentInfo(int pincode,long number) {
		System.out.println("PINCODE:"+pincode);
		System.out.println("NUMBER"+number);
		}
	
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.studentInfo("Thara");
		s1.studentInfo(123,4567);
		
		
	}
	

}