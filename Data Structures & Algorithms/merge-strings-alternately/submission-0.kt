class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var p1 = 0
        var p2 = 0

        val x = buildString {
            while (p1 < word1.length && p2 < word2.length) {
                append(word1[p1++])
                append(word2[p2++])
            }
            if (p1 >= word1.length) {
                for (i in p2 until word2.length) append(word2[i])
            }
            else if (p2 >= word2.length) {
                for (i in p1 until word1.length) append(word1[i])
            }
        }

        return x.toString()
    }
}
