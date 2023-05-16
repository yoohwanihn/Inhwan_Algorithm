import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[][] number = new int[9][9];
        int max = Integer.MIN_VALUE;
        int[] replace = new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                number[i][j] = sc.nextInt();
                if(number[i][j]>max){
                    max = number[i][j];
                    replace[0] = i+1;
                    replace[1] = j+1;
                }
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(replace[0] + " " + replace[1]);
    }
}