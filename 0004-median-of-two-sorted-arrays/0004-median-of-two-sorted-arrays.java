import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merge=new int[m+n];
        int idx=0;
        for(int i=0;i<m;i++){
            merge[i]=nums1[i];
            idx++;
        }
        for(int j=0;j<n;j++){
            merge[idx]=nums2[j];
            idx++;
        }
        double median=0;
        Arrays.sort(merge);
        if(merge.length%2==0){
            int mid=(0+(merge.length-1))/2;
            double num1 = (double) merge[mid];
            double num2 = (double) merge[mid+1];
             median=(num1+num2)/2;
        }
        if(merge.length%2==1){
            int middle=(0+(merge.length-1))/2;
            median=merge[middle];
        }
        double doubleValue = (double) median;
        return doubleValue;
    }
}