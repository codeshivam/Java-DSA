package String;

public class StringReverseUsingTempCharArray {
	
	public static void reverseString(String str){
		
//		int i = str.length() -1;
//		//char temp[] = new char[str.length()];
//		String str1 = "";
//		while(i >=0) {
//			str1 +=str.charAt(i);
//			i--;
//		}
		int i = 0;
		String rev ="";
		while(i<str.length()) {
			rev = str.charAt(i) + rev;
			i++;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Coding Ninjas";
		reverseString(str);
		//System.out.println(c);
	}

}
