package com.mgm.efooddemo.mapping;

import java.util.HashMap;
import java.util.Map;

public class PaymentModeToZtermMapping {

	private static final Map<String, String> paymentModeToSapCodeMap = new HashMap<String, String>() {{
		put("invoice","1014");
		put("debitentry","1001");
		put("paypal", "1000");
		put("creditcard", "1000");
	}};
	
	
	
	public String map(String input) {
		if( paymentModeToSapCodeMap.containsKey(input.toLowerCase())){
			return paymentModeToSapCodeMap.get(input.toLowerCase());
		}
		return "UNSUPPORTED";
	}

}

