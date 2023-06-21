import java.util.Arrays;
class K_Radius_Subarray_Averages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int windowSize = 2 * k + 1;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        
        if (n < windowSize) {
            return ans;
        }
        
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            System.out.print(prefixSum[i]+" ");
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        
        for (int i = k; i + k < n; ++i) {
            ans[i] = (int) ((prefixSum[i + k + 1] - prefixSum[i - k]) / windowSize);
        }
        // explain
        /* first window side which is the radious of that point 2*k+1
         * then it's fill the answer with -1
         * check if the size of array fit the size of the radious
         * then the prefix is the sum of that point to all the previous point
         * next it calculate the value with the range i+k+1-(i-k) 
         * and divide by size of the window for the average 
         */
        return ans;
    }
}