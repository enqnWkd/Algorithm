import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int answer = 0;

        String[] nums = st.nextToken().split("\\+");
        for (String n : nums) {
            answer += Integer.parseInt(n);
        }

        while (st.hasMoreTokens()) {
            int sub = 0;
            String[] num = st.nextToken().split("\\+");
            for (String n : num) {
                sub += Integer.parseInt(n);
            }
            answer -= sub;
        }
        
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
