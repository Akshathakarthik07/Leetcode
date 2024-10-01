import java.util.Arrays;

public class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double[] averages = new double[n / 2];
        int left = 0, right = n - 1;
        
        for (int i = 0; i < n / 2; i++) {
            int minElement = nums[left++];
            int maxElement = nums[right--];
            averages[i] = (minElement + maxElement) / 2.0;
        }
        
        double minAverage = Double.MAX_VALUE;
        for (double avg : averages) {
            if (avg < minAverage) {
                minAverage = avg;
            }
        }
        
        return minAverage;  
    }
}
