package Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BufferReaderTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		int a =Integer.parseInt(br.readLine());
		float b = Float.parseFloat(br.readLine());
		System.out.println(a);
		System.out.println(b);
		double d = Double.parseDouble(br.readLine());
		System.out.println(d);
	}

}
