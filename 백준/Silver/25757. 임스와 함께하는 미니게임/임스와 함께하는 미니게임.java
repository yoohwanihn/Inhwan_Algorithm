import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.valueOf(str[0]);
        String game = str[1];
        int tri = 0;
        Set<String> set = new HashSet<>();
        
        for(int i=0;i<N;i++) {
        	set.add(br.readLine());
        }
        
        if(game.equals("Y")) {
        	tri = set.size();
        }
        else if(game.equals("F")) {
        	tri = set.size()/2;
        }
        else {
        	tri = set.size()/3;
        }
        System.out.println(tri);
	}
}