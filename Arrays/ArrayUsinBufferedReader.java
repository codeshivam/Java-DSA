package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUsinBufferedReader {

	public static void main(String[] args) throws IOException,NumberFormatException {
		// TODO Auto-generated method stub
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		String strNum[] = str.split(" ");
		for(int i = 0; i<strNum.length; i++) {
			System.out.println(strNum[i]);
		}
	}

}
