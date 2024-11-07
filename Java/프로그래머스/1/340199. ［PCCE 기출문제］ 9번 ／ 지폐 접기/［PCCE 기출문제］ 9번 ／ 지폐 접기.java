import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        //먼저 오름차순으로 정렬해줌
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while(bill[0] > wallet[0] || bill[1] > wallet[1]) {
            bill[1] /= 2;
            answer++;
            Arrays.sort(wallet);
            Arrays.sort(bill);
        }
        
        return answer;
    }
}