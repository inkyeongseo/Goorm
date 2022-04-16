import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer input = Integer.parseInt(br.readLine());
		
		long[] nums = new long[input];
		nums[0] = 1;
		for(int i = 1; i < input; i++){
			if(i == 1){
				nums[i] =1;
			}else{
				nums[i] = nums[i-1] + nums[i-2];
			} 
		}
		
		long w = nums[nums.length-1] * 2;
		long h = (nums[nums.length-1] + nums[nums.length-2]) * 2;
		
		long sum = w + h;
		
		System.out.println(sum);
		
	}
}