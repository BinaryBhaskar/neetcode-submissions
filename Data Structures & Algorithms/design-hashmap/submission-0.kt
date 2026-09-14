class MyHashMap() {
    private val capacity = 32
    private val buckets = Array(32) { mutableListOf<Pair<Int, Int>>() }

    private fun indexOf(key : Int) : Int {
        return (key * 51747 and Int.MAX_VALUE) % capacity
    }

    fun put(key: Int, value: Int) {
        val x = buckets[indexOf(key)].firstOrNull { it.first == key }
        if (x == null) buckets[indexOf(key)].add(Pair(key, value)) 
        else {
            val idx = buckets[indexOf(key)].indexOf(x)
            buckets[indexOf(key)][idx] = Pair(key, value)
        }
    }

    fun get(key: Int): Int {
        val x = buckets[indexOf(key)].firstOrNull { it.first == key }
        if (x == null) return -1 else return x.second
    }

    fun remove(key: Int) {
        val x = buckets[indexOf(key)].firstOrNull { it.first == key }
        if (x == null) return else buckets[indexOf(key)].remove(x)
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
