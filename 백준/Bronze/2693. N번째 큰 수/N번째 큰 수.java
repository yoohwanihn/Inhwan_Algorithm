import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        int[][] array = new int[iter][10];
        for(int i=0;i<iter;i++){
            for(int j=0;j<10;j++){
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<iter;i++){
            Arrays.sort(array[i]);
            System.out.println(array[i][7]);
        }
    }
}