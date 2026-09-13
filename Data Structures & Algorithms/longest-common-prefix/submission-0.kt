class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var lcp = ""
        if (strs.size == 0) return lcp

        var smallestWord = strs[0]
        for (i in strs) {
            if (i.length < smallestWord.length) smallestWord = i
        }

        for (i in 0 until smallestWord.length) {
            val c = smallestWord[i]
            if (strs.all { str -> str[i] == smallestWord[i] }) {
                lcp = lcp + "${smallestWord[i]}"
            } else {
                return lcp
            }
        }
        return lcp
    }
}
