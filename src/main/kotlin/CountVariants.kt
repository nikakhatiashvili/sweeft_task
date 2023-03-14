
fun main(args: Array<String>) {
    val n = 9
    val tasks = CountVariants()
    val numWays = tasks.countVariants(n)
    println("Number of ways to climb $n steps: $numWays")
}

class CountVariants {
    fun countVariants(n: Int): Int {
        if (n <= 2) {
            return n
        }

        var prev1 = 1
        var prev2 = 2
        for (i in 3..n) {
            val curr = prev1 + prev2
            prev1 = prev2
            prev2 = curr
        }
        return prev2

    }
}