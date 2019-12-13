import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unittest.com.Addition;

class test {
Addition a=new Addition();
	@Test
	void sum3numbers() {
		assertEquals(6,a.sumnumbers(new int[] {1,2,3}));
		//fail("Not yet implemented");
	}
	@Test
	void sum1numbers() {
		assertEquals(1,a.sumnumbers(new int[] {1}));
		//fail("Not yet implemented");
	}
}
