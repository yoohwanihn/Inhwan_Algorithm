class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;
        for(int i : array) {
			if(Math.abs(n-i)<diff) {
				diff = Math.abs(n-i);
                answer = i;
			}
            else if(Math.abs(n-i)==diff && i<answer){
                answer = i;
            }
		}
        return answer;
    }
}