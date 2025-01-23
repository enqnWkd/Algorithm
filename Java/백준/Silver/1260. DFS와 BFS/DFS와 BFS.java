import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list.get(i));
        }

        visited = new boolean[list.size()];

        dfs(v);

        for (int i = 0; i < n+1; i++) {
            visited[i] = false;
        }

        bfs(v);
    }

    static void dfs(int nodeIdx) {
        visited[nodeIdx] = true;
        System.out.print(nodeIdx + " ");

        for (int node : list.get(nodeIdx)) {
            if (!visited[node])
                dfs(node);
        }
    }

    static void bfs(int start) {
        System.out.println();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int nodeIdx = q.poll();
            System.out.print(nodeIdx + " ");

            for (int node : list.get(nodeIdx)) {
                if (!visited[node]) {
                    visited[node] = true;
                    q.add(node);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
