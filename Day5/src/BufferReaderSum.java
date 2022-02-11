import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class BufferReaderSum {
		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			int Z;
			InputStreamReader I = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(I);
			System.out.println("type First number to add");
			int n = Integer.parseInt(br.readLine());
			System.out.println("type second number to add");
			int m = Integer.parseInt(br.readLine());
			Z = m+n;
			System.out.println("ur sum is : "+Z);
		}

	}
