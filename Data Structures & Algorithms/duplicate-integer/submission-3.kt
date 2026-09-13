class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (i in nums) {
            if (i in seen) {
                return true
            }
            seen.add(i)
        }
        return false
    }
}
