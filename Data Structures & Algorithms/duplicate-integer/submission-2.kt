class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = hashSetOf<Int>()
        for (i in nums) {
            if (i !in hashSet) {
                hashSet.add(i)
            } else {
                return true
            }
        }
        return false
    }
}
