import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int[] arr;
	static int N, M;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<M;i++) {	 
			int search = Integer.parseInt(st.nextToken());
			if(binarySearch(search)) {
				sb.append("1\n");
			}
			else {
				sb.append("0\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
	public static boolean binarySearch(int num) {
		int low = 0;
		int high = N-1;
		
		while(high>=low) {
			int midindex = (high + low) / 2 ;
			int mid = arr[midindex];
			if(mid>num) {
				high = midindex - 1;
			}
			else if(mid<num) {
				 low = midindex + 1;
			}
			else {
				return true;
			}
		}
		return false;
	}
}