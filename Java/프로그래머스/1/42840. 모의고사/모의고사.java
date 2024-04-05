import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        
        List<Integer> list = new ArrayList<>();
        int[] po1 = {1,2,3,4,5};
        int[] po2 = {2,1,2,3,2,4,2,5};
        int[] po3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == po1[i%po1.length]) cnt1++;
            if (answers[i] == po2[i%po2.length]) cnt2++;
            if (answers[i] == po3[i%po3.length]) cnt3++;
        }
        
        if (cnt1 == cnt2 && cnt2 == cnt3) {
            list.add(1);
            list.add(2);
            list.add(3);
        }
        else if (cnt1 > cnt2 && cnt1 > cnt3) list.add(1);
        else if (cnt1 < cnt2 && cnt2 > cnt3) list.add(2);
        else if (cnt1 < cnt3 && cnt2 < cnt3) list.add(3);
        else if (cnt1 == cnt2) {
            list.add(1);
            list.add(2);
        }
        else if (cnt2 == cnt3) {
            list.add(2);
            list.add(3);
        }
        else if (cnt1 == cnt3) {
            list.add(1);
            list.add(3);
        }
        
        return list;
    }
}
