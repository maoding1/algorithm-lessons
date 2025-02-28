package BinarySearch;

public class Example {


    /** 给定这样一个数组，求：
     *  1. 找到第一个大于等于5的元素下标 IsBlue: nums[m] < target, return: r
     *  2. 找到最后一个小于5的元素下标   IsBlue: nums[m] < target, return : l
     *  3. 找到第一个大于5的元素下标    IsBlue: nums[m] <= target, return: r
     *  4. 找到最后一个小于等于5的元素下标 IsBlue: nums[m] <= target, return : l
     *  数组：{1,2,3,5,5,5,8,9}**/

    public static int binarySearch(int [] arr, int target) {
        int l = -1, r = arr.length;
        while (l + 1 != r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= 5) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,5,8,9};
        System.out.println(binarySearch(arr, 5));
    }
}
