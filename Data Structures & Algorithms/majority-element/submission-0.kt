class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var curr = 0
        for (i in 0 until nums.size) {
            if (count == 0) curr = nums[i]
            if (nums[i] == curr) count++
            else count--
        }
        return curr
    }
}
