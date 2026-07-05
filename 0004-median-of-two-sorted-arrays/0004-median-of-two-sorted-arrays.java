class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int k, i, j, n;
        int mid;
        i = j = k = 0;
        n = num1.length + num2.length;
        int[] r = new int[n];
        for (; i < num1.length && j < num2.length;) {
            if (num1[i] < num2[j]) {
                r[k++] = num1[i];
                i++;
            } else {
                r[k++] = num2[j];
                j++;
            }
        }
        for (; i < num1.length;) {
            r[k++] = num1[i++];
        }

        for (; j < num2.length;) {
            r[k++] = num2[j++];
        }
        if (r.length % 2 == 0) {
            mid = r.length / 2;
            return (double) (r[mid] + r[mid - 1]) / 2;
        } else {
            mid = r.length / 2;
            return (double) (r[mid]);
        }

    }
}