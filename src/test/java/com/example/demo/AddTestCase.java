package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.DefaultAddition;

class AddTestCase {

	@Test
	void addTest1() {
		AddInterface add = new DefaultAddition();
		assertEquals(20,add.add(10, 10));
	}
		@Test
		void addTest2() {
			AddInterface add = new DefaultAddition();
			assertEquals(0,add.add(1, -1));
	}

}
