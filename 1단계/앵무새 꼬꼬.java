import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		String[] text = new String[input];
		for(int i = 0; i < input; i++){
			text[i] = br.readLine();
		}
		List<StringBuilder> list = new ArrayList<>();
		for(int i = 0; i < input; i++){
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < text[i].length(); j++){
				char ch = text[i].charAt(j);
				if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
					sb.append(ch);
				}
			}
			list.add(sb);
		}
		
		// System.out.println(list.size());
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}