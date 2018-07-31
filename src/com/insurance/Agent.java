package com.insurance;

public class Agent   {
	
	private int agent_id;
	
	private static String assistingApproval;

	private static String claimedPolicy;
	
	public static String validate_customer(String policy) 
	{
		System.out.println(policy+" customer is being validated ");
		
		return assistingApproval;
	}
	public static String passingInfoToManager(String assistingApproval)
	{
	
		System.out.println(assistingApproval+" Passing Info to Manager.");
		return claimedPolicy;
	}
    public static boolean claimStatus(boolean decision)
	{
		System.out.println(decision+" passing manager decision to customer");
		return decision;
	}
	
	public static void main(String[] args)
	{
		MediAssist obj = new MediAssist();
		obj.createPolicies("Medical", "FullBody Claim");
		
		validate_customer("medical");
		passingInfoToManager("databse validated");
		claimStatus(true);
	
		
	}
}


