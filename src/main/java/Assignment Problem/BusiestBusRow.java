public class BusiestBusRow {

    // Returns {rowIndex, total}
    static int[] busiestRow(int[][] grid) {
        int bestRow = 0, bestTotal = -1;
        for (int i = 0; i < grid.length; i++) {
            int total = 0;
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
            }
            if (total > bestTotal) { // strictly larger keeps the smaller index on ties
                bestTotal = total;
                bestRow = i;
            }
        }
        return new int[]{bestRow, bestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };
        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]); // Row 1, Total 7
    }
}

/*
 * Complexity: O(r * c) time, since every seat is visited once.
 * Additional space: O(1), only a few counters are used.
 */
