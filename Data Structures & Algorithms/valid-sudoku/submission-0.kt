class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (row in 0 until 9) {
            val seen = HashSet<Char>()
            for (item in board[row]) {
                if (item == '.') continue
                if (item in seen) return false
                seen.add(item)
            }
        }
        for (col in 0 until 9) {
            val seen = HashSet<Char>()
            for (i in 0 until 9) {
                val item = board[i][col]
                if (item == '.') continue
                if (item in seen) return false
                seen.add(item)
            }
        }
        for (sqRow in 0 until 3) {
            for (sqCol in 0 until 3) {
                val seen = HashSet<Char>()
                val startRow = 3*sqRow
                val startCol = 3*sqCol
                for (r in startRow until startRow + 3) {
                    for (c in startCol until startCol + 3) {
                        val item = board[r][c]
                        if (item == '.') continue
                        if (item in seen) return false
                        seen.add(item)
                    }
                }
            }
        }
        return true
    }
}
