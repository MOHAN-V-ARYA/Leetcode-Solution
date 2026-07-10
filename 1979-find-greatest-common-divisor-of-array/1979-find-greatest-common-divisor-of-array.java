class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length,small=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(small>nums[i])small=nums[i];

            if(max<nums[i])max=nums[i];
        }

        while(small != 0){
           int rem = max % small;
           max=small;
           small=rem;
        }

        return max;
        
    }
}