class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        boolean tf = n%slice == 0;
        if(tf) answer=n/slice;
        else answer=1+n/slice; 
        return answer;
    }
}