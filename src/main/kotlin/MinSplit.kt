fun main(args: Array<String>) {

    val tasks = MinSplit()
    val moneyToSplit = 323
    println("Minimum coins to split: " + tasks.minSplit(moneyToSplit))
}

class MinSplit {
    fun minSplit(amount: Int): Int {
        val coins = intArrayOf(50, 20, 10, 5, 1)
        var remainingAmount = amount
        var numCoins = 0
        var index = 0

        while (remainingAmount > 0) {
            val coinValue = coins[index]
            if (coinValue <= remainingAmount) {
                remainingAmount -= coinValue
                numCoins++
            } else {
                index++
            }
        }
        return numCoins
    }
}