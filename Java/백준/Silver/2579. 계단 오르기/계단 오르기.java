import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] val = new int[n+1][3];
        int[] stair = new int[n+1];

        for (int i=1; i<=n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        if (n==1) {
            System.out.println(stair[1]);
            System.exit(0);
        }
        
        val[1][1] = stair[1]; val[1][2] = 0;
        val[2][1] = stair[2]; val[2][2] = stair[1] + stair[2];

        for (int i=3; i<=n; i++) {
            val[i][1] = Math.max(val[i-2][1], val[i-2][2]) + stair[i];
            val[i][2] = val[i-1][1] + stair[i];
        }

        System.out.println(Math.max(val[n][1], val[n][2]));
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
