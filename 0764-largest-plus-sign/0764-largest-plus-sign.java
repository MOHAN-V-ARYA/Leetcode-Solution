class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];

        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = -1;
        }

        int[][] left = new int[n][n];
        int[][] right = new int[n][n];
        int[][] up = new int[n][n];
        int[][] down = new int[n][n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1)
                    count = 0;
                else
                    left[i][j] = ++count;
            }

            count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == -1)
                    count = 0;
                else
                    right[i][j] = ++count;
            }
        }

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (grid[i][j] == -1)
                    count = 0;
                else
                    up[i][j] = ++count;
            }

            count = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (grid[i][j] == -1)
                    count = 0;
                else
                    down[i][j] = ++count;
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != -1) {
                    int order = Math.min(
                        Math.min(left[i][j], right[i][j]),
                        Math.min(up[i][j], down[i][j])
                    );
                    ans = Math.max(ans, order);
                }
            }
        }

        return ans;
    }
}