package stringcalculator;

import java.util.regex.*;

public class StringCalculator {
	
	private static Pattern p;    
    private static String EMPTY = "";
	private static String REGEX = ",|\\n";
	
	public int add(CharSequence numbers) {
		int result = 0;
		if (numbers != EMPTY) {
			
			p = Pattern.compile(REGEX);
			String[] splitNumbers = p.split(numbers);
			
			for(String number : splitNumbers) {
				result+= Integer.parseInt(number);
			}
		}
		return result;
	}
}
