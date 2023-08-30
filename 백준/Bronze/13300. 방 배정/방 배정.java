import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       int N = Integer.parseInt(st.nextToken());
       int K = Integer.parseInt(st.nextToken());
       int[][] room = new int[2][6];
       int avail_room = 0;
       for(int i=0;i<N;i++) {
    	   st = new StringTokenizer(br.readLine()," ");
    	   int S = Integer.parseInt(st.nextToken());
    	   int Y = Integer.parseInt(st.nextToken());
    	   room[S][Y-1]++;
       }
       
       for(int i=0;i<room.length;i++) {
    	   for(int j=0;j<room[i].length;j++) {
    		   avail_room += (room[i][j]/K)+(room[i][j]%K); //4명일때도 1을 더하게 됨
    	   }
       }
       
       System.out.println(avail_room);
       
    }
}
