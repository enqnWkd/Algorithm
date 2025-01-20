import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        for (int i=0; i<n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        for (int i : num) {
            bw.write(i + "\n");
        }
        bw.close();

    }

    public static void main(String[] args) throws IOException {

        new Main().solution();
    }
}
