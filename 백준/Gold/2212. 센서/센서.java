import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int result = 0;
		
		//센서보다 집중국의 수가 더 크면 각 센서에 집중국을 설치하면 거리의 합은 0이 됨
		if(N<=K) {
			System.out.println(result);
			return;
		}
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//센서의 위치를 오름차순 정렬
		Arrays.sort(arr);
		
		//각 센서 사이의 거리를 배열에 저장. N개의 각 센서의 거리는 N-1개의 배열이 나옴
		int[] dif = new int[N-1];
		
		for(int i=0;i<dif.length;i++) {
			dif[i] = arr[i+1] - arr[i];
		}
		//센서간의 거리를 오름차순 정렬
		Arrays.sort(dif);
		
		for(int i=0;i<N-K;i++) {
			result+=dif[i];
		}

		System.out.println(result);
	}
}
