class Solution {
    public int passThePillow(int n, int time) {
        int cycleLength = 2 * (n - 1);
        int pos = time % cycleLength;

        if (pos < n) {
            return pos + 1;
        } else {
            return cycleLength - pos + 1;
        }
    }
    
}