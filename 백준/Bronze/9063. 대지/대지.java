import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xmin = Integer.MAX_VALUE;
        int xmax = Integer.MIN_VALUE;
        int ymin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE;
   
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x<xmin) {xmin = x;}
            if(x>xmax) {xmax = x;}
            if(y<ymin) {ymin = y;}
            if(y>ymax) {ymax = y;}
        }
        if(xmax-xmin==0||ymax-ymin==0){
           System.out.println("0");
        } else{
           System.out.println((Math.abs(xmax-xmin))*(Math.abs(ymax-ymin)));
        }
	}
}