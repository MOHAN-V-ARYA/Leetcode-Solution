class Solution {
    public int missingNumber(int[] nums) {
        int num,sum=0,n;
        n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
         return num=(n*(n+1)/2)-sum;
         //return num;
        
    }
}