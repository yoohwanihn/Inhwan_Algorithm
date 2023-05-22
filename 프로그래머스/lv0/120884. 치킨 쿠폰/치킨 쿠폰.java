class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;
        while(chicken!=0){
            answer+=chicken/10;
            rest+=chicken%10;
            chicken=chicken/10;
            if(rest>=10){
                answer++;
                chicken++;
                rest=rest-10;
            }
        }
        return answer;
    }
}