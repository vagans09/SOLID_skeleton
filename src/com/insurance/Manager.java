package com.insurance;

public class Manager {
	
	private static boolean mangerDecision;
	int manager_id;
	
	static boolean decisionMaking(String assistingApproval) {
		
		System.out.println("Claim Approved.");
		return mangerDecision;
	}
public static void main(String[] args) {
	
	MediAssist obj = new MediAssist();
	obj.createPolicies("Medical", "FullBody Claim");
	
	decisionMaking("True");
}

}
