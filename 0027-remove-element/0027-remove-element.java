class Solution {
    public int removeElement(int[] nums, int val) {
        int n,j=0,c=0;
        n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
                c++;
            }
        }
        while(j<n){
            nums[j++]=-1;
        }
        return c;
    }
}