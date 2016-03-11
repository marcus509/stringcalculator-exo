package stringcalculator;

public class StringCalculator {
	
	private static String REGEX = ",|\\n";
	
	public int add(String... numbers) {
		int result = 0;
		if (numbers[0] != "") {
			String[] splitNumbers = numbers[0].split(REGEX);
			
			for(String number : splitNumbers) {
				result+= Integer.parseInt(number);
			}
		}
		return result;
	}

}
