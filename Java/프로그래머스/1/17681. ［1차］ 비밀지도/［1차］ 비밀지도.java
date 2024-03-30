class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            for (int j=n-1; j>=0; j--) {
                if (j==n-1)
                    answer[i] = (arr1[i] % 2 + arr2[i] % 2 == 0) ? " " : "#";
                else
                    answer[i]= (arr1[i] % 2 + arr2[i] % 2 == 0) ? " "+answer[i] : "#"+answer[i];
                
                arr1[i] /= 2;
                arr2[i] /= 2;
                
            }
        }
        
        return answer;
    }
}