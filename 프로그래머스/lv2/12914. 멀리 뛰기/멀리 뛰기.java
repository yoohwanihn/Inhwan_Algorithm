class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] DP = new int[2001];
        
        DP[0] = 1;
        DP[1] = 2;
        for(int i=2;i<DP.length;i++){
            DP[i] = (DP[i-1] + DP[i-2])%1234567;
        }
        answer = DP[n-1];
        return answer;
    }
}