import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] recipe = new int[N];
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<recipe.length;i++) {
			recipe[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i=0;i<recipe.length;i++) {
			for(int j=i+1;j<recipe.length;j++) {
				if(recipe[i]+recipe[j]==M) {
					count++; 
					continue;
				}
			}
		}
		System.out.println(count);
	}
}