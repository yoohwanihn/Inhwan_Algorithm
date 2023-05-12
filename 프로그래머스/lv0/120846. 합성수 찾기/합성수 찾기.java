class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int number=1;number<=n;number++){
            int count=0;
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                }
                if(count==3){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}