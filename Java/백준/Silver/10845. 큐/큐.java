import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args)throws IOException {

        Queue<Integer> queue = new LinkedList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for (int i=0; i<n; i++) {
            String answer = bf.readLine();

            if (answer.startsWith("push") == true) {
                String[] intStr = answer.split(" ");
                queue.add(Integer.parseInt(intStr[1]));
            }

            else if (answer.equals("pop")) {
                if (queue.size() != 0) {
                    System.out.println(queue.remove());
                }
                else {
                    System.out.println(("-1"));
                }
            }
            else if (answer.equals("size")) {
                System.out.println(queue.size());
            }
            else if (answer.equals("empty")) {
                if (queue.isEmpty())
                    System.out.println(("1"));
                else {
                    System.out.println(("0"));
                }
            }
            else if (answer.equals("front")) {
                if (queue.size() != 0) {
                    System.out.println((queue.peek()));
                }
                else {
                    System.out.println(("-1"));
                }
            }
            else if (answer.equals("back")) {
                if (queue.size() != 0) {
                    System.out.println(((LinkedList<Integer>) queue).getLast());
                } else {
                    System.out.println("-1");
                }
            }
        }
    }

}