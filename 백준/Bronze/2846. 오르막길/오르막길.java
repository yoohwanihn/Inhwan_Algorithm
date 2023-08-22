import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] road = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        
        for(int i=0;i<road.length;i++) {
        	road[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<road.length;i++) {
        	if(road[i]>road[i-1]) {
        		top += road[i] - road[i-1];
        	}
        	else if(top!=0) {
        		list.add(top);
        		top=0;
        	}
        }
        list.add(top);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
	}
}