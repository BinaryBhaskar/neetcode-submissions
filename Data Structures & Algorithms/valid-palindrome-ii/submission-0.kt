class Solution {
    fun validPalindrome(s: String, depth: Int = 0): Boolean {
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
            if (sl != sr) {
                if (depth == 1) return false
                else return (validPalindrome(s.substring(l, r), 1) || validPalindrome(s.substring(l+1, r+1), 1))
            }
            l++
            r--
        }
        return true
    }
}
