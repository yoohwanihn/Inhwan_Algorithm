class Solution {
    public long solution(long n) {
        long answer = 0;
        double var = Math.sqrt(n);
        for(long i=1;i<=var;i++){
            if(n==i*i){
                return (i+1)*(i+1);
            }
        }
        return -1;
    }
}