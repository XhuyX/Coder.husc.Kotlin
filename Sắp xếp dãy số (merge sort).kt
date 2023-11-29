//Merge sort
fun merge(a:List <Int> ,b:List <Int> ):List <Int>{
    var x = mutableListOf <Int>()
    var l:Int=0
    var r:Int=0
    while (l<a.size && r<b.size){
        if (a[l]>=b[r]){
            x.add(b[r])
            ++r
        }
        else{
            x.add(a[l])
            ++l
        }
    }
    while (l < a.size) {
        x.add(a[l])
        ++l
    }
    while (r < b.size) {
        x.add(b[r])
        ++r
    }
    return x
}

fun split(a:List <Int> ):List <Int> {
    if (a.size<=1){
        return a
    }
    var mid:Int = a.size/2
    var left:List <Int> = a.subList(0,mid)
    var right: List <Int> = a.subList(mid,a.size)
    val sl = split(left)
    val sr = split(right)
    return merge(sl,sr)
}

fun main() {
    val sizeInput = readLine()
    val a: Int = sizeInput?.toIntOrNull() ?: run {
        println("Invalid input. Please enter a valid integer.")
        return
    }

    val arrInput = readLine()
    val arr: List<Int> = arrInput?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: run {
        return
    }

    val sortedArray = split(arr)
    println("${sortedArray.joinToString(" ")}")
}
