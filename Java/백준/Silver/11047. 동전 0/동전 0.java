import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;

        int[] nums = new int[n];
        for (int i=1; i<=n; i++) {
            nums[n-i] = Integer.parseInt(br.readLine());
        }

        for (int i : nums) {
            if (k == 0) break;
            answer += k / i;
            k %= i;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
