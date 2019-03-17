package HomeCostEstimation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimatingTestCase {

	@Test
	void test() {
		CostEstimation test = new CostEstimation();
		int output = test.estimate("standard",500);
		assertEquals(600000,output);
	}

}
