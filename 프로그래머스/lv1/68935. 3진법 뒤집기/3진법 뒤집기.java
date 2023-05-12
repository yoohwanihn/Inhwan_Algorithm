import java.util.ArrayList ;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%3);
            n=n/3;
        }
        for(int i=0;i<list.size();i++){
            answer += Math.pow(3,list.size()-i-1)*list.get(i);
        }
        return answer;
    }
}