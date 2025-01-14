import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        LinkedList<Integer> queue = new LinkedList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String answer = bf.readLine();

            if (answer.startsWith("push")) {
                String[] intStr = answer.split(" ");
                queue.add(Integer.parseInt(intStr[1]));
            } else if (answer.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.remove() + "\n");
                }
            } else if (answer.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (answer.equals("empty")) {
                bw.write((queue.isEmpty() ? "1" : "0") + "\n");
            } else if (answer.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peek() + "\n");
                }
            } else if (answer.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peekLast() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
