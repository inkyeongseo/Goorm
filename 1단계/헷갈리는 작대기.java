import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] nums = new int[4];
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			
			switch(ch){
				case '1' :
					nums[0]++;
					break;
				case 'I' :
					nums[1]++;
					break;
				case 'l' :
					nums[2]++;
					break;
				case '|' :
					nums[3]++;
					break;
			}
				
		}
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
	}
}