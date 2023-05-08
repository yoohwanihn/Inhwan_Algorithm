class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>=b){
            for(;a-b>=0;a--){
                answer+=a;
            }
        }
        else{
            for(;b-a>=0;b--){
                answer+=b;
            }
        }
        return answer;
    }
}