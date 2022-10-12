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
	
	
	@DisplayName("TC01 - Number = Integer 1-100 Fizz")
	@ParameterizedTest
	@ValueSource(ints = {3,6,9,12,18,21,24,27,33,36,39,42,48,51,54,57,63,66,69,72,78,81,84,87,93,96,99})
	void testTC01(int input) {
		String result = multi.check(input);
		assertEquals("Fizz", result);
		}
}
