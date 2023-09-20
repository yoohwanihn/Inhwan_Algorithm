import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i)-'0';
		}
		if(!str.contains("0")||sum%3!=0) {
			System.out.println(-1);
			return;
		}
		else {
			ArrayList<Integer> list = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			String[] strArr = str.split("");
			for(int i=0;i<strArr.length;i++) {
				list.add(Integer.parseInt(strArr[i]));
			}
			Collections.sort(list,Collections.reverseOrder());
			for(int i : list) {
				sb.append(i);
			}
			System.out.println(sb.toString());
		}
	}
}
