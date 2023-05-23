import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int count = 0 ;
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for(int i=0;i<b.length;i++){
            if(b[i]==v){
                count++;
            }
        }
        System.out.println(count);
    } 
}