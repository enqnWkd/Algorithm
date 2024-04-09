import java.util.*;

class Solution {
    public List<Integer> solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int fail, less=0;
        
        Arrays.sort(stages);
        for (int i=1; i<=N; i++) {
            fail = 0;
            for (int j = less; j<stages.length; j++) {
                if (stages[j] < i) { less++; continue; }
                else if (stages[j] == i) fail++;
                else break;
            }
            if (stages.length-less == 0) map.put(i, 0.0);
            else map.put(i, (double)fail / (stages.length - less));
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        
        return keySet;
    }
}