fun main() {
    val n: Int = readLine()?.toIntOrNull() ?: 0
    val a: List<Int> = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return

    var check = false
    for (i in 0 until n - 1) {
        if (a[i] > a[i + 1]) { // Check if current element is greater than the next one
            check = true
            break
        }
    }
    
    if (check) {
        print("No")
    } else {
        print("Yes")
    }
}
