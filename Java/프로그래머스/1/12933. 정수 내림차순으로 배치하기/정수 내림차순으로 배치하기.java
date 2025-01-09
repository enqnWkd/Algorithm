import java.util.*;

class Solution {
    public long solution(long n) {
        
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬
        
        String str = "";
        for (String a : arr) {
            str += a;
        }

        return Long.valueOf(str);
    }
}