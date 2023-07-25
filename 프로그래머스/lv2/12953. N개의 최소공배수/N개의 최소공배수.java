class Solution {
    public int solution(int[] arr) {
		int answer = 0;
		answer = arr[0]*arr[1] / gcd(arr[0],arr[1]);
		for(int i=1;i<arr.length;i++) {
			answer=answer*arr[i]/gcd(answer,arr[i]);
        }
        return answer;
    }
    public int gcd(int n1, int n2){
        while(n2!=0){
            int tmp = n1;
            n1 = n2;
            n2 = tmp%n1;
        }
        return n1;
    }
}
