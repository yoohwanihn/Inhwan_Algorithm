class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = "";
        String sum2 = "";
        sum1 = Integer.toString(a) + Integer.toString(b);
        sum2 = Integer.toString(b) + Integer.toString(a) ;
        if(Integer.parseInt(sum1)>Integer.parseInt(sum2))
            answer = Integer.parseInt(sum1);
        else 
            answer = Integer.parseInt(sum2);
        return answer;
    }
}