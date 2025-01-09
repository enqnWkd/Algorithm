import java.util.*;

class Solution {
    public long solution(long n) {
        
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        String str = "";
        for (String a : arr) {
            str += a;
        }
        
        return Long.parseLong(str);
    }
}