class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val target = `val`
        val n = nums.size
        var last = n - 1
        var count = nums.count { it == target }
        val k = n - count

        for (i in 0 until k) {
            if (nums[i] == target) {
                while (nums[last] == target) last--
                nums[i] = nums[last--]
            }
        }

        return k
    }
}
