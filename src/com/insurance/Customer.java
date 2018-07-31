package com.insurance;

import java.util.List;

public class Customer  {
	private static String name;
	private static int age;
	private static List<String> medicalHistory;
	private static List<String>medicalReport;

	private static int claimid;
	private int cust_id;
	
	private static List<String> claimedPolicy;
	private static List<String> policyApplied;

	
	public static List<String> applyPolicies(List<String> policyapplied)
    {

	System.out.println("medical policy applied");
	return policyApplied;
	
    }
	public static List<String> claimPolicies(List<String> policyApplied)
	{
		System.out.println("medical policy claimed");
		return claimedPolicy;
	
	}
	public String toString(String name,int age,String medicalHistory,String medicalReport,int claimid,int cust_id) {
		System.out.println("Customer [name=" + name + ", age=" + age + ", medicalHistory=" + medicalHistory + ", medicalReport="
				+ medicalReport + ", claimid=" + claimid + ", cust_id=" + cust_id
				+ "]");
		
		return "Customer [name=" + name + ", age=" + age + ", medicalHistory=" + medicalHistory + ", medicalReport="
				+ medicalReport + ", claimid=" + claimid + ", cust_id=" + cust_id
				+ "]";
	}

	public static void main(String[] args) {
		MediAssist obj = new MediAssist();
		obj.createPolicies("Medical", "FullBody Claim");
		
		Customer patient1 = new Customer();
		patient1.toString("Ben",22,"Diabatic","high Bp",23,2005);

	
		applyPolicies(policyApplied);
		
		claimPolicies(claimedPolicy);
	}
	
}	
	


