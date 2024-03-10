package week05JavaProject;

public class App  {

	public static void main(String[] args) {
		Logger asteriskTest = new AsteriskLogger();
		Logger spacedTest =new SpacedLogger();
		
		String myString = "Happy Friday!";
		String favColor = "purple";
		String mealTime = "Lunch will be served at noon";
		String activity = "YOGA";
		
		
		// Test of asterisk log and error methods followed by spaced log and error methods with myString variable
		asteriskTest.log(myString);
		asteriskTest.error(myString);
		
		spacedTest.log(myString);
		spacedTest.error(myString);
		
		// Test of asterisk log and error methods followed by spaced log and error methods with favColor variable
		asteriskTest.log(favColor);
		asteriskTest.error(favColor);
		
		spacedTest.log(favColor);
		spacedTest.error(favColor);
		
		// Test of asterisk log and error methods followed by spaced log and error methods with mealTime variable
		asteriskTest.log(mealTime);
		asteriskTest.error(mealTime);
		
		spacedTest.log(mealTime);
		spacedTest.error(mealTime);
	
		// Test of asterisk log and error methods followed by spaced log and error methods with activity variable
		asteriskTest.log(activity);
		asteriskTest.error(activity);
		
		spacedTest.log(activity);
		spacedTest.error(activity);
		
	}

}
