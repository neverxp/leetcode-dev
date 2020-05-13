/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                tail = mid - 1;
            }
            if (target > nums[mid]) {
                head = mid + 1;
            }
            
        }
        return head;
    }
}
// @lc code=end

