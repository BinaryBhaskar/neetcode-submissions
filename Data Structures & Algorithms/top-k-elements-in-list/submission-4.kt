import java.util.PriorityQueue

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k)
        val freqs = mutableMapOf<Int, Int>()
        nums.forEach {
            val x = freqs.getOrPut(it) { 0 }
            freqs[it] = freqs[it]!! + 1
        }
        val minHeap = PriorityQueue<Pair<Int,Int>>(compareBy({it.second}))
        freqs.forEach {
            minHeap.add(Pair(it.key, it.value))
            if (minHeap.size > k) minHeap.poll()
        }
        for (i in 0 until k) result[i] = minHeap.poll().first
        return result
    }
}
