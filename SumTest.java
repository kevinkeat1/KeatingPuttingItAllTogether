package keatingConcurrency;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class SumTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		int []testArray = {1, 2, 3, 4, 5};
		int expectedSum = 15;
		
		int sum1 = keatingConcurrency.sum(testArray);
		int sum2 = keatingConcurrency.parallelSum(testArray);
		
		Assert.assertEquals(expectedSum, sum1);
		Assert.assertEquals(expectedSum, sum2);
	}

}
