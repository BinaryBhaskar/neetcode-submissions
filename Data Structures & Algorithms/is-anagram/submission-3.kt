class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val freq = IntArray(26)
        for (c in s) {
            val n = c.code - 'a'.code
            freq[n]++
        }
        for (c in t) {
            val n = c.code - 'a'.code
            freq[n]--
        }
        return freq.all { f -> f == 0 }
    }
}
