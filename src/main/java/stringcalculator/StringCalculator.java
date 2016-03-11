package stringcalculator;

public class StringCalculator {

	private static int NUMBER1 = 0;
	private static int NUMBER2 = 0;
	
	public int add(String numbers) {
		
		if (numbers != "") {
			String[] splitNumbers = numbers.split(",");
			
			switch (splitNumbers.length) {
				case 1: 
					NUMBER1 = Integer.parseInt(splitNumbers[0]);
					break;
				case 2:
					NUMBER1 = Integer.parseInt(splitNumbers[0]);
					NUMBER2 = Integer.parseInt(splitNumbers[1]);
					break;
			}
		}
		return NUMBER1 + NUMBER2;
	}

}
