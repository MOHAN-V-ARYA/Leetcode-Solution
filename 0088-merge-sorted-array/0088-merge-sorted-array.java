class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] r = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) { //&& nums1[i]!=0 && nums2[j]!=0){
                r[k++] = nums1[i];
                i++;
            } else {
                //if(nums1[i]!=0 && nums2[j]!=0){continue;}
                r[k++] = nums2[j];
                j++;
            }
        }

        while (i < m) {
            r[k++] = nums1[i++];
        }
        while (j < n) {
            r[k++] = nums2[j++];
        }

        for (i = 0; i < n + m; i++) {
            nums1[i] = r[i];
        }
    }
}