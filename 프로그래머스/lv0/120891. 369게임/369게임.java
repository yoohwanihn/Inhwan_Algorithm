class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order!=0){
            if(order==3||order==6||order==9) answer++;
            else if(order%10==3||order%10==6||order%10==9) answer++;
            order/=10;
        }
        return answer;
    }
}