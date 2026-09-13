class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Pair of Diff, Index
        val seenMap = HashMap<Int, Int>()
        nums.forEachIndexed { i, n ->
            val diff = target - n
            if (seenMap.containsKey(diff)) return intArrayOf(seenMap[diff]!!, i)
            seenMap[n] = i 
        }
        return intArrayOf(-1,-1)
    }
}
