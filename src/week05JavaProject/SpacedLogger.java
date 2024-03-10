package week05JavaProject;

public class SpacedLogger implements Logger {

	
	public void log (String string) {
		String spacedString ="";
		for(int i = 0; i < string.length(); i++) {
			spacedString += string.charAt(i) + " ";
		}
			System.out.println(spacedString);
	}

	
	public void error (String string) {
		String spacedString ="";
		for(int i = 0; i < string.length(); i++) {
			spacedString += string.charAt(i) + " ";
		}
			System.out.println("ERROR: " + spacedString);
	}

}
