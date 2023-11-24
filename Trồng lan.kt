import kotlin.math.max
fun main() {
    var n:Int = readln().toInt()
    var a:List <Int> = readln().split(" ").map { it.toInt() }
    var cnt=0
    a=a.sorted()
    for (i in 0 until n){
        cnt=max(cnt,a[i]+n-i+1)
    }
    print(cnt)
}
