import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int[] dx = {-1, 1, 0, 0}; //상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        visited = new boolean[n][n];
        int houseCnt = 0;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<str.length(); j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    houseCnt++;
                    list.add(bfs(i, j));
                }
            }
        }
        Collections.sort(list);
        System.out.println(houseCnt);
        for (int i : list) {
            System.out.println(i);
        }
    }

    static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX,startY});
        visited[startX][startY] = true;
        int cnt = 1;

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];

            for (int i=0; i<4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                    if (map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        queue.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
