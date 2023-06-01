import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int answer = -1;
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=j+1;k<num.length;k++){
                    if(num[i]+num[j]+num[k]>answer && num[i]+num[j]+num[k]<=m){
                        answer = num[i]+num[j]+num[k];
                    }
                }
            }
        }
        if(answer!=-1){
            System.out.println(answer);
        }
    }
}