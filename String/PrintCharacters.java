package String;

public class PrintCharacters {
	
	public static void printChar(String str) {
		for(int i = 0; i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		printChar(str);
	}

}
