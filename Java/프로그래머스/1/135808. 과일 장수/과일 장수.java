import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int s : score) {
            list.add(s);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i=0; i<list.size()/m; i++) {
            sum += list.get(i*m+m-1) * m;
        }
        
        return sum;
    }
}