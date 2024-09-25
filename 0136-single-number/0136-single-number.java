class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            for(int j=0;j<nums.length;j++){
                if(num==nums[j]){
                     count++;
                }
            }
            if(count==1){
                return num;
            }else{
                count=0;
            }
        }
        return 0;
    }
}