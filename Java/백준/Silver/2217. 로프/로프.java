import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] rope = new int[n];

        for (int i=0; i<n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int max = 0;

        for (int i=0; i<n; i++) {
            int weight = rope[i] * (n - i);
            max = Math.max(max, weight);
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
