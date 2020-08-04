package com.lams1989.dynamicarray;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class TestDynamicArray extends TestCase {

	public void testDynamicArray1() {
		int n = 2;
		
		List<List<Integer>> queries = Arrays.asList(Arrays.asList(1,0,5),
													Arrays.asList(1,1,7),
													Arrays.asList(1,0,3),
													Arrays.asList(2,1,0),
													Arrays.asList(2,1,1));
		
		
		List<Integer> actual = DynamicArray.dynamicArray(n, queries);
		
		assertEquals(new Integer (7), actual.get(0));
		assertEquals(new Integer (3), actual.get(1));
	}
	


}