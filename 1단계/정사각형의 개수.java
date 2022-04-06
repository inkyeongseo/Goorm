import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		long num = Long.parseLong(input);
		long sum = 0;
		
		for(long i = 1; i <= num; i++){
			sum += Math.pow(i,2);
		}
		
		
		System.out.println(sum);
	}
}

//9번, 10번 미해결