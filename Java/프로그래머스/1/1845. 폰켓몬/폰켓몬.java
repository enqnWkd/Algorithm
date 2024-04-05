import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,String> map = new HashMap<>(nums.length);
        
        for (int n : nums) {
            map.put(n, "");
        }
        
        return (map.size() > nums.length/2) ? nums.length/2 : map.size();
    }
}