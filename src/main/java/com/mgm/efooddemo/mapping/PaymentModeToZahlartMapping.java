package com.mgm.efooddemo.mapping;

import java.util.HashMap;
import java.util.Map;

public class PaymentModeToZahlartMapping {

	private static final Map<String, String> paymentModeToZahlartMap = new HashMap<String, String>() {{
		put("invoice","01");
		put("debitentry","03");
		put("paypal", "04");
		put("creditcard", "06");
		
	}};
	
	
	
	public String map(String input) {
		if( paymentModeToZahlartMap.containsKey(input.toLowerCase())){
			return paymentModeToZahlartMap.get(input.toLowerCase());
		}
		return "UNSUPPORTED";
	}

}

