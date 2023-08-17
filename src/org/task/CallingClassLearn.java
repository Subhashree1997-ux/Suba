package org.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CallingClassLearn {
	public static void main(String[] args) {
		UsedDefinedMapLearn us=new UsedDefinedMapLearn();
		us.setEmpId(1001);
		us.setName("Ravi");
		us.setPhone(8825828468l);
		us.setAddress("Chennai");
		us.setDob("10/04/1997");
		us.setDoj("10/04/2022");
		us.setEmail("subamuki1997@gmail.com");
		us.setGender("Male");
		us.setSalary(500000);
		
		
		UsedDefinedMapLearn us1=new UsedDefinedMapLearn();
		us1.setEmpId(1002);
		us1.setName("Ramesh");
		us1.setPhone(8825825668l);
		us1.setAddress("Chennai");
		us1.setDob("20/05/1997");
		us1.setDoj("20/04/2022");
		us1.setEmail("asdrfg@gmail.com");
		us1.setGender("Male");
		us1.setSalary(800000);
		
		
		
		UsedDefinedMapLearn us2=new UsedDefinedMapLearn();
		us2.setEmpId(1003);
		us2.setName("Gopi");
		us2.setPhone(9925828468l);
		us2.setAddress("Coimbatore");
		us2.setDob("19/07/1998");
		us2.setDoj("10/04/2022");
		us2.setEmail("subamuki1997@gmail.com");
		us2.setGender("Male");
		us2.setSalary(500000);
		
		
		UsedDefinedMapLearn us3=new UsedDefinedMapLearn();
		us3.setEmpId(1004);
		us3.setName("Naveen");
		us3.setPhone(8852828468l);
		us3.setAddress("Vellore");
		us3.setDob("06/06/1997");
		us3.setDoj("10/04/2022");
		us3.setEmail("Vicky1997@gmail.com");
		us3.setGender("Male");
		us3.setSalary(500000);
		
		
		UsedDefinedMapLearn us5=new UsedDefinedMapLearn();
		us5.setEmpId(1005);
		us5.setName("Vicky");
		us5.setPhone(8825828467l);
		us5.setAddress("Chennai");
		us5.setDob("24/05/1997");
		us5.setDoj("10/04/2022");
		us5.setEmail("naveen1997@gmail.com");
		us5.setGender("Male");
		us5.setSalary(500000);
		
		
		UsedDefinedMapLearn us6=new UsedDefinedMapLearn();
		us6.setEmpId(1006);
		us6.setName("Soundharya");
		us6.setPhone(8853828468l);
		us6.setAddress("Krishnagiri");
		us6.setDob("19/05/1997");
		us6.setDoj("10/04/2022");
		us6.setEmail("soundhrya@gmail.com");
		us6.setGender("FeMale");
		us6.setSalary(500000);
		
		List<UsedDefinedMapLearn> li=new ArrayList();
		li.add(us);
		li.add(us1);
		li.add(us2);
		li.add(us3);
		li.add(us5);
		li.add(us6);
		
		for(int i=0;i<li.size();i++) {
			UsedDefinedMapLearn ref = li.get(i);
			System.out.println(ref.getEmpId());
			System.out.println(ref.getName());
			System.out.println(ref.getPhone());
			System.out.println(ref.getAddress());
			System.out.println(ref.getDob());
			System.out.println(ref.getDoj());
			System.out.println(ref.getEmail());
			System.out.println(ref.getGender());
			System.out.println(ref.getSalary());
			
			
		}
		System.out.println("================Map================");
		
		Map<Integer,UsedDefinedMapLearn> m=new LinkedHashMap();
		m.put(10, us);
		m.put(20, us1);
		m.put(30, us2);
		m.put(40, us3);
		m.put(50, us5);
		m.put(60, us6);
		Collection<UsedDefinedMapLearn> values = m.values();
		for(UsedDefinedMapLearn v:values) {
			System.out.println(v.getEmpId());
			System.out.println(v.getName());
			System.out.println(v.getPhone());
			System.out.println(v.getAddress());
			System.out.println(v.getDob());
			System.out.println(v.getDoj());
			System.out.println(v.getEmail());
			System.out.println(v.getGender());
			System.out.println(v.getSalary());
		}
		
	}

}
