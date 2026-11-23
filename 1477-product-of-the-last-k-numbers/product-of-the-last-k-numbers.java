class ProductOfNumbers {
  private List<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1); // Base dummy value for easy division
    }

    public void add(int num) {
        if (num == 0) {
            // Reset the list because any future product including this 0 will be 0
            prefix = new ArrayList<>();
            prefix.add(1);
        } else {
            int lastProduct = prefix.get(prefix.size() - 1);
            prefix.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int n = prefix.size();
        // If k >= n, a zero occurred within the last k elements and reset the list
        if (k >= n) {
            return 0;
        }
        return prefix.get(n - 1) / prefix.get(n - 1 - k);
    }



}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna