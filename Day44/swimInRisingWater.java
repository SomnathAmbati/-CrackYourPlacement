class Solution {
    public class Pair {
        int x, y, time;
        Pair(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
        boolean[][] visited = new boolean[n][n];
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        pq.offer(new Pair(0, 0, grid[0][0]));
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (curr.x == n - 1 && curr.y == n - 1) {
                return curr.time;
            }

            for (int[] dir : dirs) {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    int newTime = Math.max(curr.time, grid[nx][ny]);
                    pq.offer(new Pair(nx, ny, newTime));
                }
            }
        }

        return -1; 
    }
}