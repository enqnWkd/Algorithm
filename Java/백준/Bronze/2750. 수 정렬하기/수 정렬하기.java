import java.util.*;

public class Main {
    
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }
        
        Arrays.sort(num);

        for (int i : num) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        new Main().solution();
    }
}
