
fun main(args: Array<String>) {
    val myDataStructure = MyDataStructure<String>()
    myDataStructure.add("1")
    myDataStructure.add("2")
    myDataStructure.add("3")
    myDataStructure.add("4")
    println("Size: ${myDataStructure.size()}")

    println("Contains 2: ${myDataStructure.contains("2")}")
    println("Contains 5: ${myDataStructure.contains("5")}")

    val removed = myDataStructure.remove("3")
    println("Removed 3: $removed")
    println("Size: ${myDataStructure.size()}")

    println("Contains 3: ${myDataStructure.contains("3")}")
}



class MyDataStructure<T>{
    private val map = HashMap<T, Node<T>>()
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    private class Node<T>(val value: T, var prev: Node<T>? = null, var next: Node<T>? = null)

    fun add(item: T) {
        val node = Node(item)
        map[item] = node
        if (head == null) {
            head = node
            tail = node
        } else {
            tail!!.next = node
            node.prev = tail
            tail = node
        }
    }
    fun remove(item: T): Boolean {
        val node = map[item] ?: return false
        if (node.prev != null) {
            node.prev!!.next = node.next
        } else {
            head = node.next
        }
        if (node.next != null) {
            node.next!!.prev = node.prev
        } else {
            tail = node.prev
        }
        map.remove(item)
        return true
    }
    fun contains(item: T): Boolean {
        return map.containsKey(item)
    }
    fun size(): Int {
        return map.size
    }
}
