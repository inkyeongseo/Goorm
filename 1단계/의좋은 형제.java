import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int day = sc.nextInt();
		

		for(int i = 0; i < day;i++){
			if(i % 2 == 0){
				//형
				if(first % 2 == 0){
					first /= 2;
					second += first;
				}else{
					first /= 2;
					second += (first+1);
				}
			}else{
				//동생
				if(second % 2 == 0){
					second /= 2;
					first += second;
				}else{
					second /= 2;
					first += (second+1);
				}
			}
			
			// System.out.println("first : "+ first + "second : "+second);
		}
		
		System.out.println(first + " " + second);
	}
}