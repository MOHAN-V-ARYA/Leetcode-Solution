class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length,c=0,k=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(i != j && nums[i] > nums[j]){
                    c++;
                }
            }
            ans[k++]=c;
        }
        return ans;
    }
}