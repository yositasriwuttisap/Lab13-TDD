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
	
	@DisplayName("TC03 - Number = Integer 1-100 FizzBuzz")
	@ParameterizedTest
	@ValueSource(ints = {15,30,45,60,75,90})
	void testTC03(int input) {
		String result = multi.check(input);
		assertEquals("FizzBuzz", result);
		}
	
	@DisplayName("TC04 - Number = Integer 1-100 No Fizz, No Buzz, No FizzBuzz")
	@ParameterizedTest
	@ValueSource(strings = {"1,1","2,2","4,4","7,7","8,8","11,11","13,13","14,14","16,16","17,17","19,19","22,22","23,23","26,26","28,28"
			,"29,29","31,31","32,32","34,34","37,37","38,38","41,41","43,43","44,44","46,46","47,47","49,49","52,52","53,53"
			,"56,56","58,58","59,59","61,61","62,62","64,64","67,67","68,68","71,71","73,73","74,74","76,76","77,77","79,79"
			,"82,82","83,83","86,86","88,88","89,89","91,91","92,92","94,94","97,97","98,98"})
	void testTC04(String input) {
		String[] n = input.split(",");
		int number1 = Integer.parseInt(n[0]);
		String expect = n[1];
		String result = multi.check(number1);
		assertEquals(expect, result);
		}
}
