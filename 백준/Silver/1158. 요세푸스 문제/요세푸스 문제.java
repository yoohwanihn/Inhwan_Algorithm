import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i=0;i<N;i++) {
            qu.add(i+1);
        }
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
        while (qu.size()>1) {

            for(int i =0; i<K-1;i++) {
                int value = qu.poll();
                qu.offer(value);
            }
            sb.append(qu.poll()).append(", ");
        }

        sb.append(qu.poll()).append('>');
        System.out.println(sb.toString());
	}
}