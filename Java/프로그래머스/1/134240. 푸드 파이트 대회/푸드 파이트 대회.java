class Solution {
    public String solution(int[] food) {
        String answer = "";
        String ans2 = "";
        
        for (int i=1; i<food.length; i++) 
            for (int j=0; j<food[i]/2; j++) {
                answer += i;
                ans2 = i + ans2;
            }
        
        return answer + 0 + ans2;
    }
}