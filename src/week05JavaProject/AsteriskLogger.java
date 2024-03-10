package week05JavaProject;

public class AsteriskLogger implements Logger {

	public void log (String string) {
		System.out.println("***" + string + "***");
	}

	 public void error (String string) {
		String box = "";
		for(int i =0; i < string.length() + 14; i++) {
			box+= "*";
		}
			System.out.println(box);
			System.out.println("***Error: " + string + "***");
			System.out.println(box);
		}

}
