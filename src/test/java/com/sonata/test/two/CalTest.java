package com.sonata.test.two;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import com.sonata.two.Calculator;



public class CalTest {
	Calculator c3 = new Calculator();

		@Test
		public void addTest() {
			Calculator c1 = new Calculator();
			Assertions.assertEquals(4, c1.add(2,2));
		}
			@Test
			public void mulTest() {
				Calculator c2 = new Calculator();
				Assertions.assertEquals(4, c2.mul(2,2));
		}
		
			@Test
			public void divTest() {
				int x = c3.div(1, 1);
			
				assertThrows(ArithmeticException.class,()->c3.div(1,0),"it is an error");
			}
			@Test
			public void divTest1() {
				int x = c3.div(1, 1);
			
				assertThrows(ArithmeticException.class,()->c3.div(1,2),"it is an error");
			}


}
