package com.sapient.week1;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*; 

	public class AppTest
	{
		private App app;
	    public void setup() {
	        app = new App();
	    }
	    public void testCheckEvenPositive() 
		{
	        Boolean ch=app.Ceven.check(400);
	        assertTrue(ch == true);
	    }

	    public void testCheckOddPositive() 
		{
	        Boolean ch=app.Ceven.check(501);
	        assertTrue(ch == true);
	    }
	    public void testCheckNull() 
		{
	        Boolean ch=app.Ceven.check(0);
	        assertTrue(ch == true);
	    }
	    public void testCheckEvenNegative() 
		{
	        Boolean ch=app.Ceven.check(-400);
	        assertTrue(ch == true);
	    }

	    public void testCheckOddNegative() 
		{
	        Boolean ch=app.Ceven.check(-501);
	        assertTrue(ch == true);
	    }
		
	}
