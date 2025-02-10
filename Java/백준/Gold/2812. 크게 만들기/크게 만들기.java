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

        char[] num = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int popCount = 0;

        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && stack.peek() < num[i] - '0' && popCount < k) {
                stack.pop();
                popCount++;
            }
            stack.push(num[i] - '0');
        }
        while (popCount < k) {
            stack.pop();
            popCount++;
        }
        for (int i : stack) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
