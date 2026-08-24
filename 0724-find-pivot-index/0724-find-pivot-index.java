class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
          
            int j=0;
            int sum1=0;
            int sum2=0;

            while(j<i){
                 sum1+=nums[j];
                 j++;
            }
            int m=i+1;
            while(m<n){
                sum2+=nums[m];
                m++;
            }

            if(sum1 == sum2 ){
                return i;
            }
        }

        return -1;
    }
}