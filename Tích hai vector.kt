fun main() {
    val n = readLine()?.toIntOrNull()?:return
    val a: List<Int> = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
    val b: List<Int> = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
    var s:Long=0
    for (i in 0 until n){
        s+= a[i]*b[i]
    }
    if (s==0.toLong()){
        print("Yes")
    }
    else{
        print("No")
    }
}
