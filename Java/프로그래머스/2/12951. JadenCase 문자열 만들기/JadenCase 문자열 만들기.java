class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        boolean space = true;
        
        for (String a : arr) {
            if (a.equals(" ")) {
                space = true;
                answer += a;
                continue;
            }
            else {
                if (space == true) {
                    a = a.toUpperCase();
                    answer += a;
                    space = false;
                }
                else {
                    a = a.toLowerCase();
                    answer += a;
                }
            }
        }
        
        return answer;
    }
}