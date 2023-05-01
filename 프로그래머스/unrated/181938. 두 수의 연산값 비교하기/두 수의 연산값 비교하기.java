class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = "";
        int result = 0;
        sum = Integer.toString(a);
        sum += Integer.toString(b);
        result = Integer.parseInt(sum);
        if(result>2*a*b) answer=result;
        else answer=2*a*b;
        return answer;
    }
}