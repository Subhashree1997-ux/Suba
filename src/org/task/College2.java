package org.task;

public class College2 extends College1 {
	public void studentName2() {
		super.courseName1();
		System.out.println("The Student Name is: Subha");
	}
	public void courseName2() {
		this.studentName2();
		System.out.println("The course Name is:B.E.,CSE");
	}
	public static void main(String[] args) {
		College2 cl=new College2();
		cl.courseName2();
	}

}
