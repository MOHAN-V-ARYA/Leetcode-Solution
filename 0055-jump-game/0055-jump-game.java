class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length,doora=0;

        for(int i=0;i<n;i++){
           // nums[i]=nums[i+1];
           if(i>doora)return false;
            
             doora=Math.max(doora, nums[i]+i);

            if(doora >= n-1)return true;
        }

        return true;
    }
}