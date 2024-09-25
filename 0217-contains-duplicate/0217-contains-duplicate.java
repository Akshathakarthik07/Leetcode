class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> q=new HashSet<>();
         int count=0;
        for(int i=0;i<nums.length;i++){
         if(q.contains(nums[i])){
             count++;
             return true;
         }
         q.add(nums[i]);
     }
     return false;
    }
}