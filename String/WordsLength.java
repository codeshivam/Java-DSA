package String;

public class WordsLength {
	
	public static int countWords(String str) {	
		//Your code goes here
		int count = 0;
		int n = str.length();
		if(n == 0) {
			return count;
		}
		
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		int c = countWords(str);
		System.out.println(c);
	}

}
