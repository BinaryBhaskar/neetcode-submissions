class Solution {

    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return ""
        return strs.joinToString(prefix = "<", separator = "^.^", postfix = ">")
    }

    fun decode(str: String): List<String> {
        if (str.isEmpty()) return emptyList()
        return str.removeSurrounding("<", ">").split("^.^").toList()
    }
}
