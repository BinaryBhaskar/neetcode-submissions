
class Solution {
    private fun mergeSort(nums: IntArray, temp: IntArray, start: Int, end: Int) {
        if (start >= end) return
        val mid = start + (end - start) / 2

        mergeSort(nums, temp, start, mid)
        mergeSort(nums, temp, mid + 1, end)

        merge(nums, temp, start, mid, end)
    }

    private fun merge(nums: IntArray, temp: IntArray, start: Int, mid: Int, end: Int) {
        for (i in start..end) temp[i] = nums[i]

        var p1 = start
        var p2 = mid + 1
        var pos = start

        while (p1 <= mid || p2 <= end) {
            if (p1 > mid) nums[pos++] = temp[p2++]
            else if (p2 > end) nums[pos++] = temp[p1++]
            else if (temp[p1] <= temp[p2]) nums[pos++] = temp[p1++]
            else nums[pos++] = temp[p2++]
        }
        while (p1 <= mid) nums[pos++] = temp[p1++]
        while (p2 <= end) nums[pos++] = temp[p2++]
    }

    fun sortArray(nums: IntArray): IntArray {
        val temp = IntArray(nums.size)
        mergeSort(nums, temp, 0, nums.lastIndex)
        return nums
    }
}
