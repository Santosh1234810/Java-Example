package com.garbageCollection;

public class TestFinalize {
	public static void main(String[] args) {
		
		TestFinalize t = new TestFinalize();
		
		System.out.println(t.hashCode());
		
		t = null;
		System.gc();
		
		System.out.println("End of the garbaze collector");
		
		
	}
	protected void finalize()
	{
		System.out.println("Inside finalize");
	}
}
