class Solution {
    fun mergeAlternately(word1: String, word2: String): String = buildString {
        val n = minOf(word1.length, word2.length)

        for (i in 0 until n) {
            append(word1[i])
            append(word2[i])
        }

        append(word1, n, word1.length)
        append(word2, n, word2.length)
    }
}