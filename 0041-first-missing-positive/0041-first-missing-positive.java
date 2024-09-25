import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int num=1;
        while (hash.contains(num)) {
            num++;
        }
        
        return num;
    }
}