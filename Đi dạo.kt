fun main() {
    var n: Long = readLine()!!.toLong()
    var a = arrayListOf<Long>(1, 1, 2, 4)

    
    for (i in 4..60) {
        a.add((a[i - 1] + a[i - 2] + a[i - 3]).toLong())
    }

    
    for (i in 0 until n) {
        var arr = readLine()?.split(" ")?.map { it.toLong() }
        if (arr!=null){
            println(a[(arr[1]-arr[0]).toInt()])
        }
    }
}
