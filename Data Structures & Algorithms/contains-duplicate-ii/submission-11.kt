class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        for (i in 0 until nums.size) {
            val seen = HashSet<Int>()
            for (j in 0..k) {
                if (i+j >= nums.size) continue
                if (nums[i+j] in seen) return true
                seen.add(nums[i+j])
            }
        }
        return false
    }
}
