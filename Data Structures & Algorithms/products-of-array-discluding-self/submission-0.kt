class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        // Product of everything to the left
        var prefix = 1
        for (i in nums.indices) {
            result[i] = prefix
            prefix *= nums[i]
        }

        // Product of everything to the right
        var suffix = 1
        for (i in nums.indices.reversed()) {
            result[i] *= suffix
            suffix *= nums[i]
        }

        return result
    }
}