package com.mgm.efooddemo.mapping;

import org.dozer.ConfigurableCustomConverter;

public class ConstantCustomConverter implements ConfigurableCustomConverter {
	
	private String parameter;

	@Override
	public Object convert(Object arg0, Object arg1, Class<?> arg2, Class<?> arg3) {

		return parameter;
	}

	@Override
	public void setParameter(String parameter) {
		this.parameter = parameter;

	}

}
