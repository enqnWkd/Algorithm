import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            String answer = "YES";

            if (str.length() % 2 == 1 || str.startsWith(")")) {
                System.out.println("NO");
                continue;
            }

            Stack<String> stack = new Stack<>();
            for (int j=0; j<str.length(); j++) {
                String ch = String.valueOf(str.charAt(j));
                if (ch.equals("(")) stack.push(ch);
                else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    }
                    else stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                answer = "NO";
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}