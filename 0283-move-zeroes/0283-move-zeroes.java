import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                arr.add(nums[j]);
            }
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=arr.get(k);
        }
    }
}