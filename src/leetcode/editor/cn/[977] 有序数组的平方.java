package leetcode.editor.cn;

class SquaresOfASortedArray{
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int mid = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                mid = i;
            }
            nums[i] *= nums[i];
        }

        if (nums.length <= 1 || mid == -1)
            return nums;

        int left = mid, right = mid + 1, count = 0;
        int[] sorted = new int[nums.length];
        while (count < nums.length) {
            if (right > nums.length - 1) {
                sorted[count] = nums[left];
                count++;
                left--;
            } else if (left < 0) {
                sorted[count] = nums[right];
                count++;
                right++;
            } else {
                if (nums[left] < nums[right]) {
                    sorted[count] = nums[left];
                    count++;
                    left--;
                } else {
                    sorted[count] = nums[right];
                    count++;
                    right++;
                }
            }
        }
        return sorted;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}