/*
 * @lc app=leetcode id=26 lang=kotlin
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var left = 0
        var right = 0
        while (right < nums.size) {
            if (nums[left] != nums[right]) {
                left++
                nums[left] = nums[right]
            }
            right++
        }
        return left + 1
    }
}
// @lc code=end

