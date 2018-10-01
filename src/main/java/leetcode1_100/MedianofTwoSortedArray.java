package leetcode1_100;

public class MedianofTwoSortedArray {
    /**
     * index   0    1   2   3   4   5
     * L1          R1
     * num1    3    5 |  8   9               4   cut1
     * L2              R2
     * num2    1    2   7  | 10  11  12      6   cut2
     * <p>
     * num3 1   2   3   5   7 | 8   9   10  11  12
     * <p>
     * max(L1)<=min(R2)
     * max(L2)<=min(R1)
     * <p>
     * 对于 nums1
     * L1>R2 cut1 左移  (cutL,cut1-1)
     * L2>R1 cut2 右移 (cut1+1,cutR)
     *
     * 参考博客
     * https://blog.csdn.net/ldw662523/article/details/79990911
     */

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
//            根据 数组长度确定输入位置
            return findMedianSortedArrays(nums2, nums1);
        }
        int len = nums1.length + nums2.length;
        int cut1 = 0;
        int cut2 = 0;
        int cutL = 0;
        int cutR = nums1.length;
        while (cut1 <= nums1.length) {
            cut1 = (cutR - cutL) / 2 + cutL;
            cut2 = len / 2 - cut1;
            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            double R1 = (cut1 == nums1.length) ? Integer.MAX_VALUE : nums1[cut1];
            double R2 = (cut2 == nums2.length) ? Integer.MAX_VALUE : nums2[cut2];
            if (L1 > R2) {
                cutR = cut1 - 1;
            } else if (L2 > R1) {
                cutL = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    L1 = L1 > L2 ? L1 : L2;
                    R1 = R1 < R2 ? R1 : R2;
                    return (L1 + R1) / 2;
                } else {
                    R1 = R1 < R2 ? R1 : R2;
                    return R1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums1 = {3};
        int[] nums2 = {1, 2};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}

