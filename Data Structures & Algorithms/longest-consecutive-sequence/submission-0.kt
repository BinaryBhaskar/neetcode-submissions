class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val seen = nums.toHashSet()
        var lg = 0

        for ( i in nums ) {
            if ( i-1 !in seen ) {
                var curr = i
                var l = 1

                while (curr + 1 in seen) {
                    curr++
                    l++
                }
                lg = maxOf(lg, l)
            }
        }
        return lg
    }
}
