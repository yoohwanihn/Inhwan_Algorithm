//에라토스테네스의 체는 소수를 판별할때 가장 효율적인 알고리즘

import java.util.Scanner;

public class Main{
	public static boolean[] prime;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		prime = new boolean[B+1];
		isprime();
		for(int i=A;i<=B;i++) {
			if(!prime[i]) {
				System.out.println(i);
			}
		}
		
	}
	//에라토스 테네스의 체 메소드 구현
	public static void isprime() {
		prime[0] = prime[1] = true; // 0과 1은 소수가 아님.
		//제곱근까지만 판별하면 됨.
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) continue; // true일 경우 소수가 아님으로 판별하므로 바로 PASS
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}
}