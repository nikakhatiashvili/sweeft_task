fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 2, 3, 1)
    val tasks = SingleNumber()
    println("Single number: " + tasks.singleNumber(numbers))
}


class SingleNumber {
    fun singleNumber(nums:List<Int>): Int {
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            if (map.containsKey(num)) {
                map[num] = map[num]!! + 1
            } else {
                map[num] = 1
            }
        }
        for ((num, count) in map) {
            if (count == 1) {
                return num
            }
        }
        return -1
    }
}