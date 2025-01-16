import java.util.*;

class Solution {
        public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
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
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);

        for (int i : answer) {
            System.out.println("** " + i);
        }

        return answer;
    }
}