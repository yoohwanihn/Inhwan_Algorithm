import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		int[][] rect = new int[3][2];
		int x = 0;
		int y = 0;
		
		for(int i=0;i<rect.length;i++) {
			rect[i][0] = sc.nextInt();
			rect[i][1] = sc.nextInt();
		}
		
		if(rect[0][0] == rect[1][0]) {
			x = rect[2][0];
		}
		else if(rect[0][0] == rect[2][0]) {
			x = rect[1][0];
		}
		else {
			x = rect[0][0];
		}
		
		if(rect[0][1] == rect[1][1]) {
			y = rect[2][1];
		}
		else if(rect[0][1] == rect[2][1]) {
			y = rect[1][1];
		}
		else {
			y = rect[0][1];
		}
		
		System.out.println(x + " " + y);
	
	}
}