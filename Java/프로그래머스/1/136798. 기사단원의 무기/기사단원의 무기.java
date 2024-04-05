class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i=1; i<=number; i++) {
            if (i==1) {answer++; continue;}
            
            int cnt = 2;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) cnt++;
                if (cnt > limit) {
                    answer += power;
                    break;
                }
            }
            if (cnt <= limit)
                answer += cnt;
        }
        
        return answer;
    }
}