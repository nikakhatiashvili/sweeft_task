fun main(args: Array<String>) {

    val tasks = NotContains()
    val nums = listOf( 0, 1, 2, 3,4, 5)
    println("Smallest missing positive integer: " + tasks.notContains(nums))
}

class NotContains {
    fun notContains(nums: List<Int>): Int {
        val numSet = nums.toHashSet()
        var i = 1

        while (numSet.contains(i)) {
            i++
        }
        return i
    }
}