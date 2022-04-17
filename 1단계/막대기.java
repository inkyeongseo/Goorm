import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
		int[] nums = new int[num];
		for(int i = 0; i < num; i++){
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 1;
		int max = nums[num-1];
		
		for(int j = num-2; j >=0; j--){
			if(nums[j] > max){
				count++;
				max = nums[j];
			}
		}

		System.out.println(count);
	}
}