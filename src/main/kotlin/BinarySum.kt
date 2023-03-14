import java.math.BigInteger

fun main(args: Array<String>) {

    val a = "10101111001"
    val b = "11001"
    val task = BinarySum()
    val sum = task.binarySum("1000010", "1100100")
    println("Sum of $a and $b is $sum")

}

class BinarySum {
    fun binarySum(a: String, b: String): String {
        val numA = BigInteger(a, 2)
        val numB = BigInteger(b, 2)
        val sum = numA.add(numB)
        return sum.toString(2)
    }
}
