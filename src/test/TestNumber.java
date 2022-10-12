package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Multinumber;

class TestNumber {
	Multinumber multi;
	
	@BeforeEach
	public void setup() {
		multi = new Multinumber();
	}
	
	
	@DisplayName("TC01 - Number = Integer 1-100 No FizzBuzz, Fizz, Buzz")
	@ParameterizedTest
	@ValueSource(ints = {1,2,4,7,8,11,13,14,16,17,19,22,23,26,28,29,31,32,34,37,38,41,43,44,46,47,49,
						52,53,56,58,59,61,62,64,67,68,71,73,74,76,77,79,82,83,86,88,89,91,92,94,97,98})
	void testTC01(int input) {
		String result = multi.check(input);
		assertEquals(input, result);
		}
}
