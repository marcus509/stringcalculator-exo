package stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator sc = new StringCalculator();

	@Test
	public void check_add() {
		// Test
		int result = sc.add("1");

		// Assertions
		assertThat(result).isEqualTo(-1);
	}

}