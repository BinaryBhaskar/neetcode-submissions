class MyHashSet() {
    val capacity = 32
    val buckets = Array(capacity) { mutableListOf<Int>() }
    fun indexOf(key: Int) : Int {
        return (key*62427 and Int.MAX_VALUE) % capacity
    }

    fun add(key: Int) {
        val bucket = buckets[indexOf(key)]
        if (key in bucket) return
        bucket.add(key)
    }

    fun remove(key: Int) {
        buckets[indexOf(key)].remove(key)
    }

    fun contains(key: Int): Boolean {
        return (key in buckets[indexOf(key)])
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
