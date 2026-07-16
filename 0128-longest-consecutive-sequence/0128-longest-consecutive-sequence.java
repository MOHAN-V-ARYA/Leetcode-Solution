class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length,count=0,length=0,mlength=0;

       HashSet<Integer> set=new HashSet<>();
       for(int num : nums)set.add(num);


        for(int num : set){

            if(!set.contains(num-1)){
                    count=num;
                    length=1;

                while(set.contains(count+1)){
                    count++;
                    length++;
                }
                mlength = Math.max(mlength, length);
        }


        }
    return mlength;
    }
}