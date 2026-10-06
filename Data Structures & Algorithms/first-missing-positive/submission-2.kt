class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        nums.forEachIndexed { i, n -> if (n <= 0 || n > nums.size) nums[i] = nums.size + 1 }

        for (i in 0 until nums.size) {
            val n = abs(nums[i])
            if (n > nums.size || n == 0) continue
            if (nums[n - 1] > 0) nums[n - 1] = -nums[n - 1]
        }

        for (i in nums.indices) { if (nums[i] > 0) return i + 1 }
        return nums.size + 1
    }
}
