class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        nums.forEachIndexed { i, n ->
            for (j in 1..k) {
                if (i + j >= nums.size) continue
                if (nums[i+j] == n) return true
            }
        }
        return false
    }
}
