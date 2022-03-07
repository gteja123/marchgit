package com.automation.utilities;

public class Demo {
   int pracrHrs;
   String result;
   float salary;
public int getPracrHrs() {
	return pracrHrs;
}
public void setPracrHrs(int pracrHrs) {
	this.pracrHrs = pracrHrs;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
   public static void main(String[] args) {
	Demo demo = new Demo();
	demo.setPracrHrs(9);
	demo.setResult("JOB");
    demo.setSalary(95000.9f);
    System.out.println(demo.pracrHrs);
    System.out.println(demo.result);
    System.out.println(demo.salary);
   
   }
   
   
}
