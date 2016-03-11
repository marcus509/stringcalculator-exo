package stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator sc = new StringCalculator();

	@Test public void 
	check_if_add_is_empty() {
		// Test
		int result = sc.add("");

		// Assertions
		assertThat(result).isEqualTo(0);
	}
	
	@Test public void 
	check_if_add_contains_one_number() {
		// Test
		int result = sc.add("1");

		// Assertions
		assertThat(result).isEqualTo(1);
	}
	
	@Test public void 
	check_if_add_contains_two_numbers() {
		// Test
		int result = sc.add("1,2");

		// Assertions
		assertThat(result).isEqualTo(3);
	}
	
	@Test public void 
	check_if_add_contains_more_than_two_numbers() {
		// Test
		int result = sc.add("1,2,3");

		// Assertions
		assertThat(result).isEqualTo(6);
	}
	
	@Test public void 
	check_if_add_contains_slash_n() {
		// Test
		int result = sc.add("1\n2,3");

		// Assertions
		assertThat(result).isEqualTo(6);
	}

}