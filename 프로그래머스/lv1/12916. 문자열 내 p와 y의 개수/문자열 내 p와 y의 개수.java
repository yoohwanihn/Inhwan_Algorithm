class Solution {
    boolean solution(String s) {
        int count = 0;
        char ch[] = s.toCharArray();
        for(char c : ch){
            if(c == 'p' || c == 'P'){
                count++;
            }
            else if(c == 'y' || c == 'Y'){
                count--;
            }
        }
        return count==0;
    }
}