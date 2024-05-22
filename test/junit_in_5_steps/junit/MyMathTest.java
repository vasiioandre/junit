package junit_in_5_steps.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();

	@Test
	void calculateSum_ThreeMemberArray() {
		int result = math.calculateSum(new int[] {1, 2, 3});
		int expectedResult = 6;
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	void calculateSum_ZeroLenthArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
	}

}
