class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        
        for (int j = 1; j < n - 1; j++) {
            int lessThanJ = 0;
            int greaterThanJ = 0;
            int lessThanJRight = 0;
            int greaterThanJRight = 0;
            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) lessThanJ++;
                if (rating[i] > rating[j]) greaterThanJ++;
            }
            for (int k = j + 1; k < n; k++) {
                if (rating[k] < rating[j]) lessThanJRight++;
                if (rating[k] > rating[j]) greaterThanJRight++;
            }
            count += lessThanJ * greaterThanJRight + greaterThanJ * lessThanJRight;
        }
        
        return count;
    }
}
