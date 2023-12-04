import kotlin.math.abs

fun main() {
    val n: Int = readLine()?.toIntOrNull() ?: 0
    var s= readLine()
    val arr = s?.split(" ")?.mapNotNull { it.toLongOrNull() } ?: return
    var xmin = arr[0]
    var y= arr[0]
    var lox =0
    var loy=0
    for (i in 1 until n){
        if(arr[i]<xmin){
            xmin=arr[i]
            lox=i
        }
        if (arr[i]>y){
            y=arr[i]
            loy=i
        }
    }
    print(abs(lox-loy))
}
