import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i=0;i<N;i++) {
			String result = solution(br.readLine());
			System.out.println(result);
		}
	}
	
	public static String solution(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='(') {
				st.push(c);
			}
			//위 조건을 만족 못시킨다는것은 )라는 뜻
			else if(st.empty()) {
				return "NO";
			}
			else {
				st.pop();
			}
		}
		
		if(!st.empty()) {
			return "NO";
		}
		else {
			return "YES";
		}
		
	}
}