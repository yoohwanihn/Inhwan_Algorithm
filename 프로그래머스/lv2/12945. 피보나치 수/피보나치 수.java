class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] D = new int[n+1];
        D[0] = 0;
        D[1] = 1;
        for(int i=2;i<=n;i++){
            D[i] = (D[i-1] + D[i-2])%1234567;
        }
        answer = D[n];
        return answer;
    }
    
}