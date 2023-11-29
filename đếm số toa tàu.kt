import kotlin.math.ceil

fun main() {
    val n = readLine()
    var (a,b) = n?.split(" ")?.mapNotNull { it.toIntOrNull() }?:return
    print(ceil(a/ (b.toDouble()*4)).toInt())
}
