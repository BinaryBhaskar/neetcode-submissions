class Solution {
    fun reverseString(s: CharArray) {
        var first = 0
        var last = s.size - 1
        while (first < last) {
            s[first] = s[last].also { s[last] = s[first] }
            first++
            last--
        }
    }
}
