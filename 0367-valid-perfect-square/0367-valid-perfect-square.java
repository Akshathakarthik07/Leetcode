class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        int sqrtX=(int) Math.sqrt(num);
        return sqrtX*sqrtX==num;
    }
}