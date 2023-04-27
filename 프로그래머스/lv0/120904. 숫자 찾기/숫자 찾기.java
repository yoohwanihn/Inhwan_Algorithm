class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        int count = 0;
        while(num!=0){
            if(num%10==k){
                count = answer;
            }
            answer++;
            num=num/10;
        }
        return count==0 ? -1 : answer-count;
    }
}