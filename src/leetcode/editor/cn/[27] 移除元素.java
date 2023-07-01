package leetcode.editor.cn;

class RemoveElement{
    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
        int[] nums = {2};
        int val = 3;
        int len = solution.removeElement(nums, val);
        System.out.println(len);
        System.out.print("nums = ");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0 || (length == 1 && nums[0] == val)) {
            return 0;
        }
        for (int i = 0, j = 1; j <= nums.length; j++) {
            if (nums[i] == val) {
                length -= 1;
            } else {
                i += 1;
            }
            if (j != nums.length) {
                nums[i] = nums[j];
            }
        }
        return length;
    }

    /* A better solution - shorter code
    class Solution {
        public int removeElement(int[] nums, int val) {
            // 快慢指针
            int slowIndex = 0;
            for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
                if (nums[fastIndex] != val) {
                    nums[slowIndex] = nums[fastIndex];
                    slowIndex++;
                }
            }
            return slowIndex;
        }
    }
     */
}
//leetcode submit region end(Prohibit modification and deletion)

}