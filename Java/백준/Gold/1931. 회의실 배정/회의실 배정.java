import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] cls = new int[n][2];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cls[i][0] = Integer.parseInt(st.nextToken());
            cls[i][1] = Integer.parseInt(st.nextToken());
        }
        //두번째 요소 기준 오름차순
        Arrays.sort(cls, (o1, o2) -> {
            if (o1[1] == o2[1]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        int end = 0;
        int answer = 0;

        for (int[] curr : cls) {
            if (curr[0] >= end) {
                answer++;
                end = curr[1];
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
