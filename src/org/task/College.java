package org.task;

public class College extends Student2{
	public void studentName() {
		super.StuName2();
		System.out.println("The Student name is:Naveen");
	}
	public void courseName() {
		this.studentName();
		System.out.println("The Course Name is:B.E.,CSE");
	}
	@Override
	public void empSalary() {
		this.courseName();
		System.out.println("The employee Salary is:50000");
		
	}
	@Override
	public void empAddress() {
		this.empSalary();
		System.out.println("The Employee address is:Chennai");
		
	}
	@Override
	public void empMob() {
		this.empAddress();
		System.out.println("The employee mobile is:8825828468");
		
	}
	@Override
	public void empAge() {
	    this.empMob();
		System.out.println("The Employee Age is: 26");
		
	}
	@Override
	public void empId() {
		this.empAge();
		System.out.println("The Employee Id is:1234");
		
	}
	@Override
	public void empName() {
		this.empId();
		System.out.println("Thw Employee Name is:Naveen");
		
	}
	@Override
	public void StuId2() {
		this.empName();
		System.out.println("The Student Id is:5678");
		
	}
	@Override
	public void stuId2() {
		this.StuId2();
		System.out.println("The Student Id is 89102");
		
	}
	@Override
	public void stuId() {
		this.stuId2();
		System.out.println("The Student is:123490");
		
	}

}
