import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(min(bill) > min(wallet) || max(bill) > max(wallet)) {
            //
            bill[bill[0] > bill[1] ? 0 : 1] /= 2;
            //
            answer++;
        }
        
        return answer;
    }
    
    private int min(int[] arr) {
        return Math.min(arr[0], arr[1]);
    }
    
    private int max(int[] arr) {
        return Math.max(arr[0], arr[1]);
    }
}