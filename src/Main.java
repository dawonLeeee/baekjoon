import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main  {
	
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[T+2];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		for(int i = 4; i <= T; i++)
			arr[i] = (arr[i-1] + arr[i-2]) % 10007;
		
		
		System.out.println(arr[T]);
	}
		
}
	
	



