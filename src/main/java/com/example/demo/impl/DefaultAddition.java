package com.example.demo.impl;

import com.example.demo.AddInterface;

public class DefaultAddition implements AddInterface {

	@Override
	public int add(int no1, int no2) {
		
		return no1 + no2;
	}

}
