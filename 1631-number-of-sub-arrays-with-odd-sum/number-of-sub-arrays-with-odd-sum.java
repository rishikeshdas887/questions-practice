class Solution {
    public int numOfSubarrays(int arr[]) {
      

        int MOD = 1_000_000_007;

        int prefixSum = 0;
        int evenCount = 1;
        int oddCount = 0;

        long ans = 0;

        for (int num : arr) {

            prefixSum += num;

            if (prefixSum % 2 == 0) {
                ans += oddCount;
                evenCount++;
            } else {
                ans += evenCount;
                oddCount++;
            }

            ans %= MOD;
        }

        return (int) ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna