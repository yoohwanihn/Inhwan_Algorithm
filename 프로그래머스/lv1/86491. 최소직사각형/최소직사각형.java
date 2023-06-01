class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int h = 0;
        for(int i=0;i<sizes.length;i++){
            for(int j=0;j<2;j++){
                if(sizes[i][j]>max){
                    max = sizes[i][j];
                }
            }
            if(sizes[i][0]>=sizes[i][1]&&sizes[i][1]>=h){
                h=sizes[i][1];
            }
            else if(sizes[i][0]<=sizes[i][1]&&sizes[i][0]>=h){
                h=sizes[i][0];
            }
        }
        answer = max*h;
        return answer;
    }
}