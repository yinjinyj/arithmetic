object FourTest {
    @JvmStatic
    fun main(argus: Array<String>) {
        var sum = 52L
        var end = sum / 2L
        var index = sum - 1
        var count=0
        while (true) {
            count++
            if (index > end) {
                index -= (sum - index)
            } else if (index < end) {
                index += (index - 1)
            } else {
                print(count)
                break
            }
        }

    }
}