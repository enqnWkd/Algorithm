import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static Character[][] maze;
    static Queue<int[]> hoon = new LinkedList<>();
    static Queue<int[]> fire = new LinkedList<>();
    static int[][] jt;
    static int[][] ft;
    static int n,m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new Character[n][m];

        jt = new int[n][m];
        ft = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ft[i], -1);
            Arrays.fill(jt[i], -1);
        }

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<m; j++) {
                maze[i][j] = str.charAt(j);
                if (maze[i][j] == 'J') {
                    hoon.offer(new int []{i,j});
                    jt[i][j] = 0;
                }
                else if (maze[i][j] == 'F') {
                    fire.offer(new int []{i,j});
                    ft[i][j] = 0;
                }
            }
        }

        int result = bfs();
        if (result == 0) {
            System.out.println("IMPOSSIBLE");
        }
        else System.out.println(result);

    }

    static int bfs() {

        // 불의 BFS
        while (!fire.isEmpty()) {
            int[] f = fire.poll();
            int x = f[0];
            int y = f[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maze[nx][ny] != '#' && ft[nx][ny] == -1) {
                    fire.offer(new int[]{nx, ny});
                    ft[nx][ny] = ft[x][y] + 1;
                }
            }
        }

        // 지훈의 BFS
        while (!hoon.isEmpty()) {
            int[] j = hoon.poll();
            int x = j[0];
            int y = j[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 탈출 성공
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    return jt[x][y] + 1;
                }
                if (maze[nx][ny] == '#' || jt[nx][ny] >= 0) continue;
                if (ft[nx][ny] != -1 && ft[nx][ny] <= jt[x][y] + 1) continue;

                hoon.offer(new int[]{nx, ny});
                jt[nx][ny] = jt[x][y] + 1;
            }
        }

        return 0;
    }


    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
