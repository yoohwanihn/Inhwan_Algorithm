class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        if(money-sum(count)*price<0)
        answer=Math.abs((money-sum(count)*price));
        else answer=0;
        return answer;
    }
    public long sum(int n){
        if(n>1) return n+sum(n-1);
        else if(n==1) return 1;
        else return 0;
    }
}