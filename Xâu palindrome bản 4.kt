fun main() {
    val n:String = readln()
    var cnt=0
    for (i in 0 until n.length/2){
        if (n[i].compareTo(n[n.length-i-1])!=0){
            ++cnt
        }
    }
    print(cnt)
}
