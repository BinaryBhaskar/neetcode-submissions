class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        var cand1: Int? = null
        var cand2: Int? = null
        var count1 = 0
        var count2 = 0

        for (num in nums) {
            if (cand1 != null && num == cand1) {
                count1++
            } else if (cand2 != null && num == cand2) {
                count2++
            } else if (count1 == 0) {
                cand1 = num
                count1 = 1
            } else if (count2 == 0) {
                cand2 = num
                count2 = 1
            } else {
                count1--
                count2--
            }
        }

        val result = mutableListOf<Int>()
        val threshold = nums.size / 3
        
        var c1Count = 0
        var c2Count = 0

        for (num in nums) {
            if (num == cand1) c1Count++
            else if (num == cand2) c2Count++
        }

        if (c1Count > threshold) cand1?.let { result.add(it) }
        if (c2Count > threshold) cand2?.let { result.add(it) }

        return result
    }
}
