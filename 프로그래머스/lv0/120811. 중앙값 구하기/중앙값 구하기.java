class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if(array.length%2==0){
            answer=array.length/2 + 1;
        }
        else answer=array.length/2;
        return array[answer];
    }
}