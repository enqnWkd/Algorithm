class Solution {
    public int solution(String dartResult) {
        
        int[] score = new int[4];
        int idx = 1;
        
        String[] arr = dartResult.split("");
        for (String a : arr) {
            if (a.matches("S")) {
            }
            else if (a.matches("D")) {
                score[idx-1] *= score[idx-1];
            }
            else if (a.matches("T")) {
                score[idx-1] *= score[idx-1]*score[idx-1];
            }
            else if (a.matches("\\*")) {
                score[idx-1] *= 2;
                score[idx-2] *= 2;
            }
            else if (a.matches("\\#")) {
                score[idx-1] *= -1;
            }
            else if (score[idx-1]==1 && Integer.parseInt(a)==0) {
                score[idx-1] *= 10;
            }
            else {
                idx++;
                score[idx-1] = Integer.parseInt(a);
            }
        }
        return score[1]+score[2]+score[3];
    }
}