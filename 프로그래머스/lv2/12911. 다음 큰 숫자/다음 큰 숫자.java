class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n+1;i<1000000;i++){
            if(binary(n)==binary(i)){
                return i;
            }
        }
        return 0;
    }
    public int binary(int n){
        int count = 0;
        while(n!=0){
            if(n%2==1)
                count++;
            n=n/2;
        }
        return count;
    }
}