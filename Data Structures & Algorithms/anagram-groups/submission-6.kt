class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anags = mutableMapOf<String, MutableList<String> >()

        strs.forEach { str ->
            val key = IntArray(26)
            for (c in str) {
                val i = c.code - 'a'.code
                key[i]++
            }
            anags.getOrPut(key.joinToString(".")) { mutableListOf<String>() }.add(str)
        }
        return anags.values.toList()
    }
}
