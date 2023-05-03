class Solution {
    public boolean solution(int x) {
        int count = 0;
        int num = x;
        while(x!=0){
            count += x%10;
            x=x/10;
        }
        return num%count==0;
    }
}