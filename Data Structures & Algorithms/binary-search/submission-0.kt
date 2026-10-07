class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (target == nums[mid]) return mid
            else if (target > nums[mid]) low = mid + 1
            else high = mid - 1
        }
        return -1
    }
}
