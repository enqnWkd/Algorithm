import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] str = new String[2];
        int m = 0;
        String temp = "";
        
        for (int j=0; j<strings.length; j++) {
            for (int i=j+1; i<strings.length; i++) {
                
                if (Integer.valueOf(strings[j].charAt(n)) > Integer.valueOf(strings[i].charAt(n))) {
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
                
                else if (Integer.valueOf(strings[j].charAt(n)) == Integer.valueOf(strings[i].charAt(n))) {
                    str[0] = strings[j];
                    str[1] = strings[i];
                    Arrays.sort(str);
                    strings[j] = str[0];
                    strings[i] = str[1];
                }
            }
        }

        return strings;
    }
}