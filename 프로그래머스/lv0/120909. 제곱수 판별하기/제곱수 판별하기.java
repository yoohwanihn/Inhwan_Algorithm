class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);
        if(n==sqrt*sqrt)
            return 1;
        else
            return 2;
    }
}