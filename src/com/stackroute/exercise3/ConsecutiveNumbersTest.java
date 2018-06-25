package com.stackroute.exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveNumbersTest {

	
		@Test
	    public void testIsConsecutive() {
	        ConsecutiveNumbers consecutiveNumber= new ConsecutiveNumbers();
	        boolean expectedValue = true;
	        boolean actualValue = consecutiveNumber.numberChecker("54,53,52,51,50,49,48");
	        assertEquals(expectedValue, actualValue);
	    }
	    
	    @Test
	    public void testIsNotConsecutive() {
	        ConsecutiveNumbers consecutiveChecker = new ConsecutiveNumbers();
	        boolean expectedValue = false;
	        boolean actualValue = consecutiveChecker.numberChecker("1,2,3,4,5,6,6");
	        assertEquals(expectedValue, actualValue);
	    }
	    
	   
	    
	    @Test(expected = IllegalArgumentException.class)
	    public void testIIlegalArgument() {
	        ConsecutiveNumbers consecutiveChecker = new ConsecutiveNumbers();
	        consecutiveChecker.numberChecker("aa,96,95,94,93,99,88");
	    }
		
	}


