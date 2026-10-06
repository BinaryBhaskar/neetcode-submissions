class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1

        while ( l < r) {
            val sl = s[l].lowercaseChar()
            val sr = s[r].lowercaseChar()
            if (!(sl in 'a'..'z' || sl in '0'..'9')) {
                l++
                continue
            }
            if (!(sr in 'a'..'z' || sr in '0'..'9')) {
                r--
                continue
            }
            if (sl != sr) return false
            l++
            r--
        }
        return true
    }
}
