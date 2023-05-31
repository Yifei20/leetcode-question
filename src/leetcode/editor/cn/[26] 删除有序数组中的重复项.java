package leetcode.editor.cn;

class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
        System.out.println(solution.removeDuplicates(new int[] {1, 1, 2}));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int i = 1, j = 1;
        while (j < n) {
            if (nums[j] != nums[j-1]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}