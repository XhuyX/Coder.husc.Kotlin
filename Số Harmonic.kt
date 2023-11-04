fun main() {
    var n:Double= readln().toDouble()
    var s:Double= 0.0
    for ( i in 1..n.toLong()){
        s+=(1/i.toDouble())
    }
    print("%.6f".format(s))
}
