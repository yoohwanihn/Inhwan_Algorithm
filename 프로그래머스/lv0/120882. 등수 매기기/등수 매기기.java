class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[score.length];
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                rank[i] +=score[i][j];
            }
        }
        for(int i=0;i<rank.length;i++){
            for(int j=0;j<rank.length;j++){
                if(rank[i]<rank[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}