class Solution {
    public int solution(int hp) {
        int answer = 0;
        switch(hp%5){
                case 0: answer = hp/5;
                break;
                case 1: answer = hp/5 + 1;
                break;
                case 2: answer = hp/5 + 2;
                break;
                case 3: answer = hp/5 + 1;
                break;
                case 4: answer = hp/5 + 2;
                break;  
        }
        return answer;
    }
}