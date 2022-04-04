import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int time = sc.nextInt();
		
		int nums[] = new int[num];
		for(int i = 0; i < num; i++){
			nums[i] = sc.nextInt();
		}
		
		int count = 0;
		int pre = 0;

		
		for(int j = 0; j < num; j++){
			int ch = nums[j] - pre;
		
			if(ch <= time){
				count++;
			}	else{
				count = 1;
			}
			pre = nums[j];
		}
		
		System.out.println(count);
		
	}
}