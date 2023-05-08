class Solution {
    public static int solution(int n) {
        int answer = 0;
        int compare_n = 1;
        for(int i=2;compare_n<=n;i++){
            compare_n *= i;
            answer++;
        }
        return answer;
    }
}