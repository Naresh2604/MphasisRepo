package com.Junit.JunitExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	@Test   
    public void addTest() {  
		Calculator calc1=new Calculator();
		int actual=calc1.add(2, 3);
		assertEquals(5,actual);

	}
	@Test   
    public void subTest() {  
		Calculator calc2=new Calculator();
		int actual=calc2.sub(2, 3);
		assertEquals(5,actual);

	}
	@Test   
    public void mulTest() {  
		Calculator calc3=new Calculator();
		int actual=calc3.mul(2, 3);
		assertEquals(6,actual);

	}
	@Test   
    public void divTest() {  
		Calculator calc4=new Calculator();
		int actual=calc4.div(2, 3);
		assertEquals(5,actual);

	}
	@Test
	public void isEvenTest() {
		assertTrue(new Calculator().isEven(4),"for input 4 the result should be true");
	}

}
