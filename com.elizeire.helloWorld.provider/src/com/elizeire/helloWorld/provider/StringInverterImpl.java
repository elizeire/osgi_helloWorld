package com.elizeire.helloWorld.provider;

import org.osgi.service.component.annotations.Component;

import com.elizeire.helloWorld.api.StringInverter;


@Component
public class StringInverterImpl implements StringInverter {

	@Override
	public String invert(String string) {
		return new StringBuilder(string).reverse().toString();
	}
	

}
