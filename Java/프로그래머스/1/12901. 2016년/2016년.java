class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] tot = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int daya = b;
        
        for (int i=0; i<a-1; i++)
            daya += tot[i];
        
        return days[(5 + (daya - 1)) % 7];

    }
}