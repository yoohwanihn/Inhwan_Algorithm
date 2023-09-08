import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Max = Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			String[] dice = br.readLine().split(" ");
			int money = 0;
			int dice1 = Integer.parseInt(dice[0]);
			int dice2 = Integer.parseInt(dice[1]);
			int dice3 = Integer.parseInt(dice[2]);
			
			if(dice1==dice2 && dice2==dice3) {
				money = 10000 + dice1 * 1000;
			}
			else if(dice1==dice2 || dice2==dice3){
				money = 1000 + dice2 * 100;
			}
			else if(dice1==dice3) {
				money = 1000 + dice1 * 100;
			}
			else {
				money = Math.max(dice1, Math.max(dice2, dice3))*100;
			}
			
			if(money>Max) {
				Max = money;
			}
		}
		System.out.println(Max);
	}
}