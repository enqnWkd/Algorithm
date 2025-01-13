import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args)throws IOException {
		
		Stack<Integer> stack = new Stack<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		
		for (int i=0; i<n; i++) {
			String answer = bf.readLine();
			
			if (answer.startsWith("push")==true) {
				String intStr = answer.replaceAll("[^0-9]", "");
				stack.push(Integer.parseInt(intStr));
			}
			
			else if (answer.equals("pop")) {
				if (stack.size() != 0) {
					bw.write(String.valueOf(stack.pop())+"\n");
				}
				else {
					bw.write("-1\n");
				}
			}
			else if (answer.equals("size")) {
				bw.write(String.valueOf(stack.size())+"\n");
			}
			else if (answer.equals("empty")) {
				if (stack.empty())
					bw.write("1\n");
				else {
					bw.write("0\n");
				}
			}
			else if (answer.equals("top")) {
				if (stack.size() != 0) {
					bw.write(stack.peek()+"\n");
				}
				else {
					bw.write("-1\n");
				}
			}
			bw.flush();
		}  
    }

}