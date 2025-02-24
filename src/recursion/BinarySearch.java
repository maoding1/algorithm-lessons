package recursion;

public class BinarySearch {
    /** 二分查找 **/
    /** nums: 要找的数组 , target：要找的数字 left:查找的区间左边界下标, right:要查找的区间右边界下标， 返回值：返回target在nums里的下标
     * 如果没找到 返回-1**/
    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1; // 未找到目标值
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid; // 找到目标值，返回下标
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right); // 目标值在右半部分
        } else {
            return binarySearch(nums, target, left, mid - 1); // 目标值在左半部分
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(nums, target, 0, nums.length - 1);

        if (result != -1) {
            System.out.println("目标值 " + target + " 的下标是: " + result);
        } else {
            System.out.println("目标值 " + target + " 未找到");
        }
    }
}
