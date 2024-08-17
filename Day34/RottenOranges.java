class Solution {
    public static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x; this.y = y;
        }
    }

    public int orangesRotting(int[][] g) {
        int o = 0; // Count of fresh oranges
        int t = 0; // Time
        Queue<Pair> q = new LinkedList<>();

        // Count fresh oranges and add rotten oranges to queue
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                if (g[i][j] == 2) {
                    q.add(new Pair(i, j));
                } else if (g[i][j] == 1) {
                    o++;
                }
            }
        }

        // If no fresh oranges, return 0
        if (o == 0) return 0;

        int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;

            for (int s = 0; s < size; s++) {
                Pair p = q.remove();
                for (int i = 0; i < 4; i++) {
                    int nx = p.x + d[i][0];
                    int ny = p.y + d[i][1];
                    if (nx >= 0 && nx < g.length && ny >= 0 && ny < g[0].length && g[nx][ny] == 1) {
                        g[nx][ny] = 2; // Mark as rotten
                        q.add(new Pair(nx, ny));
                        o--;
                        rotted = true;
                    }
                }
            }

            if (rotted) t++;
        }

        return o == 0 ? t : -1;
    }
}