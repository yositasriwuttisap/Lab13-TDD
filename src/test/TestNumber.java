package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestNumber {
	Multinumber multi;
	
	@BeforeEach
	public void setup() {
		multi = new Multinumber();
	}
	
	@DisplayName("TC01 - Number = 1")
	@Test
	void testTC01() {
		int result = multi.check("1");
		assertEquals(1, result);
		}
}
