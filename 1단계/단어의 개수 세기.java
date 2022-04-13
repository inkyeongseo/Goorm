import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] words = input.split(" ");
		int count = 0;
		for(int i = 0; i < words.length; i++){
			// System.out.println(i+" : "+ words[i]);
			if(words[i].length() > 0) count++;		
		}
		System.out.println(count);
	
	}
}