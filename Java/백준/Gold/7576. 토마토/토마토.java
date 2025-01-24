import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int n, m;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();
    static int[][] tomatoes;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력받기
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        tomatoes = new int[n][m];
        boolean allRipe = true;

        // 배열 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                tomatoes[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoes[i][j] == 1) {
                    queue.add(new int[]{i, j});
                } else if (tomatoes[i][j] == 0) {
                    allRipe = false;
                }
            }
        }

        if (allRipe) {
            System.out.println(0);
            return;
        }
        
        int result = bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomatoes[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(result - 1);
    }

    static int bfs() {
        int max = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 조건 체크
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (tomatoes[nx][ny] == 0) {
                        queue.add(new int[]{nx, ny});
                        tomatoes[nx][ny] = tomatoes[x][y] + 1;
                        max = Math.max(max, tomatoes[nx][ny]);
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}