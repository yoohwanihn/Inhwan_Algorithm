class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int j=0;j<queries.length;j++){
            for(int i=queries[j][0];i<=queries[j][1];i++){
                if(arr[i]>queries[j][2]){
                    if(answer[j]==0||answer[j]>arr[i]){
                        answer[j] = arr[i];
                    }
                }
            }
            if(answer[j]==0){
                answer[j]=-1;
            }
        }
        return answer;
    }
}