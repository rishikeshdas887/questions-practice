
        import java.util.*;

class Solution {

    public int minimumChanges(String s, int k) {

        int n = s.length();

        // Step 1: Precompute proper divisors
        List<Integer>[] divisors = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            divisors[i] = new ArrayList<>();
        }

        for (int d = 1; d < n; d++) {
            for (int len = 2 * d; len <= n; len += d) {
                divisors[len].add(d);
            }
        }

        // Step 2: Calculate cost of every substring
        int[][] cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int len = j - i + 1;
                int minCost = n;

                for (int d : divisors[len]) {
                    minCost = Math.min(
                        minCost,
                        getCost(s, i, j, d)
                    );
                }

                cost[i][j] = minCost;
            }
        }

        // Step 3: Dynamic Programming
        int INF = 1_000_000;

        int[][] dp = new int[n + 1][k + 1];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        dp[n][0] = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int parts = 1; parts <= k; parts++) {

                for (int end = i + 1; end < n; end++) {

                    if (dp[end + 1][parts - 1] != INF) {

                        dp[i][parts] = Math.min(
                            dp[i][parts],
                            cost[i][end] + dp[end + 1][parts - 1]
                        );
                    }
                }
            }
        }

        return dp[0][k];
    }

    // Calculate changes needed for a substring
    // to become a semi-palindrome using divisor d
    private int getCost(String s, int i, int j, int d) {

        int changes = 0;

        for (int offset = 0; offset < d; offset++) {

            int left = i + offset;
            int right = j - d + 1 + offset;

            while (left < right) {

                if (s.charAt(left) != s.charAt(right)) {
                    changes++;
                }

                left += d;
                right -= d;
            }
        }

        return changes;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna