class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid -1;
            else
                return mid;
        }
//last round:
// target > nums[mid] == nums[lo] == nums[hi], after loop lo = lo + 1 == high +1 which will be the correct index for insertion
// when target < nums[mid] == nums[lo] == nums[hi], after loop hi = hi - 1 == low - 1 is not the correct index, should be low
        return start;
    }
}