class Solution {
    fun sortColors(nums: IntArray) {
        var low = 0
        var mid = 0
        var high = nums.lastIndex

        while (mid <= high) {
            when (nums[mid]) {
                0 -> {
                    nums[low] = nums[mid].also { nums[mid] = nums[low] }
                    low++
                    mid++
                }
                1 -> mid++
                2 -> {
                    nums[high] = nums[mid].also { nums[mid] = nums[high] }
                    high --
                }
            }
        }
    }
}
