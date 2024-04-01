import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> list = new ArrayList<>();
        for (String s : name) {
            list.add(s);
        }
        
        for (int i=0; i<photo.length; i++) {
            for (String s : photo[i]) {
                if (list.contains(s)) answer[i] += yearning[list.indexOf(s)];
            }
        }
        return answer;
    }
}