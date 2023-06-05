import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int count;
		for(int iter=0;iter<3;iter++) {
			count = 0;
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
				if(arr[i]==0) {
					count++;
				}
			}
			switch(count) {
			case 0 : System.out.println("E");
				break;
			case 1 : System.out.println("A");
				break;
			case 2 : System.out.println("B");
				break;
			case 3 : System.out.println("C");
				break;
			case 4 : System.out.println("D");
				break;
			}
		}
		
	}
}
