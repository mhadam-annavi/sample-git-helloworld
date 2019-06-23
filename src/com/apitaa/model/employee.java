/**
 * 
 */
package com.apitaa.model;

/**
 * @author mhada
 *
 */
public class employee {

	/**
	 * 
	 */
	public int empid;
	public int age;
	
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}

	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public employee() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
