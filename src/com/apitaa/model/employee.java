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

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
