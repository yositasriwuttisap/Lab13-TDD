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
	
	@DisplayName("TC02 - Number = Integer 1-100 Buzz")
	@ParameterizedTest
	@ValueSource(ints = {5,10,20,25,35,40,50,55,65,70,80,85,95,100})
	void testTC02(int input) {
		String result = multi.check(input);
		assertEquals("Buzz", result);
		}
	
	@DisplayName("TC03 - Number = Integer 1-100 Buzz")
	@ParameterizedTest
	@ValueSource(ints = {5,10,20,25,35,40,50,55,65,70,80,85,95,100})
	void testTC03(int input) {
		String result = multi.check(input);
		assertEquals("Buzz", result);
		}
}
