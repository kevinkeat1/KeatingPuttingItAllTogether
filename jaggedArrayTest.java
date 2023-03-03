package keatingJaggedArray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class jaggedArrayTest {

	@Test
	void testGetSumAndAverage() {
		int[][] array = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		double sumResult = keatingJaggedArray.getSum(array);
		double averageResult = keatingJaggedArray.getAverage(array);
		
        assertEquals(45.0, sumResult, 0.001);
        assertEquals(5.0, averageResult, 0.001);
	}

}
