import java.util.*;
class Solution {
    
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<commands.length; i++) {
            
            for(int j=0; j<commands[i][1]-commands[i][0]+1; j++) {
                list.add(array[j+commands[i][0]-1]);
            }
            
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer i1, Integer i2) {
                    return i1 - i2;
                }
            });
            answer[i] = list.get(commands[i][2]-1);
            list.clear();
        }
        return answer;
    }
}