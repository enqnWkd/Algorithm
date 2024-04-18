class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n;

        for (int i=0; i<nums.length-2; i++)
            for (int j=i+1; j<nums.length-1; j++)
                for (int k=j+1; k<nums.length; k++) {
                    System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    n = nums[i] + nums[j] + nums[k];
                    
                    answer++;
                    
                    for (int l=2; l<=n/2; l++) {
                        if (n % l == 0) {
                            answer -= 1;
                            break;
                        }
                    }
                }

        return answer;
    }
}
