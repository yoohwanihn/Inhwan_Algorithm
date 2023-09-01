import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0;i<N;i++) {
			Stack<Character> stack = new Stack<>();
			String input = br.readLine();
			if(input.length()%2!=0) {
				continue;
			}
			stack.push(input.charAt(0));
			for(int j=1;j<input.length();j++) {
				if(stack.size()>0 && input.charAt(j) == stack.peek() ) {
					stack.pop();
				}
				else {
					stack.push(input.charAt(j));
				}
			}
			if(stack.isEmpty()) {
				count++;
			}
		}
		System.out.println(count);
	}
}