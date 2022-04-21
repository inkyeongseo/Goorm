import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long input = Integer.parseInt(br.readLine()); // long 타입 선언 중요
		
		//for문 사용하지 않고 계산하는게 필요
		long sum = input * (input + 1) / 2 % 1000000007;
  	long answer = sum * sum % 1000000007;
		
		System.out.println(answer);
	}
}