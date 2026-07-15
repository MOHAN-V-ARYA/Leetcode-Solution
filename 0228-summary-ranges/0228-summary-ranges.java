class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result =new ArrayList<>();

for(int i=0;i<nums.length;i++){
int m1=nums[i];
    while(i+1<nums.length && nums[i]+1==nums[i+1] ){
        i++;
    }

    int m2=nums[i];


    if(m1==m2){
        result.add(String.valueOf(m1));
    }else{
        result.add(m1+"->"+m2);
    }
}
        


        return result;
    }
}