class Stack<T> {
    private val list = mutableListOf<T>()

    fun push(item: T) {
        list.add(item)
    }

    fun pop(): T? {
        return if (list.isEmpty()) null
        else
            list.removeLast()
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}