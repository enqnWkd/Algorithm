import java.util.*;

class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i=0; i<progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0)
                q.add((100 - progresses[i])/speeds[i]);
            else q.add((100 - progresses[i])/speeds[i] + 1);
        }

        int first = q.poll();
        int cnt = 1;

        for (int num : q) {
            if (first >= num) {
                cnt++;
            }
            else {
                first = num;
                list.add(cnt);
                cnt = 1;
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
            
        return answer;
    }
}