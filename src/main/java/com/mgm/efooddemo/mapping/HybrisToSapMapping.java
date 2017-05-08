package com.mgm.efooddemo.mapping;

import java.util.HashMap;
import java.util.Map;

public class HybrisToSapMapping {

	private static final Map<String, String> quantityUnitMap = new HashMap<String, String>() {{
		put("pieces","PCE");
		put("kg","KGE");
		
		
	}};
	
	
	
	public String mapQuantityUnit(String input) {
		if( quantityUnitMap.containsKey(input.toLowerCase())){
			return quantityUnitMap.get(input.toLowerCase());
		}
		return "UNSUPPORTED";
	}

}

