package com.insurance;

import java.util.HashMap;
import java.util.Map;

public class MediAssist {
	
static Map<String,String> createPolicies(String name, String description) {
	
	Map<String,String> map=new HashMap<String,String>();
	
	System.out.println("Policy created");

	return map;
}	

public static void main(String[] args) {
	
createPolicies("medical" , "full body claim upto 3 lakhs");

}
}
