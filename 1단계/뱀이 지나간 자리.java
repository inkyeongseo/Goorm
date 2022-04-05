import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] str = input.split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		String[][] map = new String[a][b];
		
		int ch = 0;
		
		for(int i = 0; i < a; i++){
			for(int j = 0; j < b; j++){
				if(i % 2 == 0){
					map[i][j] = "#";
				}else{
					map[i][j] = ".";
					if(j == b-1 && ch % 2 == 0){
						map[i][j] = "#";
					}else if(j == 0 && ch % 2 == 1){
						map[i][j] = "#";
					}
				}
			}
			if(i % 2 == 1) ch ++;
		}
		
		for(int i = 0; i < a; i++){
			for(int j = 0; j < b; j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}
}