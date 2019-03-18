package HomeCostEstimation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimatingTestCase {

	@Test
	void test() {
		CostEstimation test = new CostEstimation();
		int output = test.estimate(0,500,false);
		assertEquals(600000,output);
	}

}
