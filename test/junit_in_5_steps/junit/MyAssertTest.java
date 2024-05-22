package junit_in_5_steps.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> toDos = Arrays.asList("Java", "Spring Framework", "React");
	
	@Test
	void test() {
		boolean result = toDos.contains("React");
		boolean result2 = toDos.contains("Docker");
		
		assertEquals(true, result);
		assertTrue(result);
		assertFalse(result2);
		//assertNull, assertNotNull
		
		//assertArrayEquals(new int[] {1, 2, 3}, new int[] {1, 2});
		
		assertEquals(3, toDos.size());
		//assertEquals(2, toDos.size(), "Write your error message");
	}

}
