package com.mgm.efooddemo.mapping;

import java.util.HashMap;
import java.util.Map;

public class DelieryModeToVsartMapping {

	private static final Map<String, String> paymentModeToSapCodeMap = new HashMap<String, String>() {{
		put("delivery","10");
		put("pickup","20");
		put("drive", "30");
	}};
	
	
	
	public String map(String input) {
		if( paymentModeToSapCodeMap.containsKey(input.toLowerCase())){
			return paymentModeToSapCodeMap.get(input.toLowerCase());
		}
		return "UNSUPPORTED";
	}

}

