class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length - 1;
        int[] result = new int[nums.length];
        int i = end;
        while(i >= 0) {
            int left = Math.abs(nums[start]);
            int right = Math.abs(nums[end]);
            if(left >= right) {
                result[i] = left * left;
                start ++;
            } else{
                result[i] = right * right;
                end --;
            }
            i--;
        }
        return result;
    }
}