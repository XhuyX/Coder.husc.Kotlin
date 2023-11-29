fun main() {
    val sizeInput = readLine()
    var a: Int = sizeInput?.toIntOrNull() ?:0
    while (a!=0){
        val arrInput = readLine()
        var arr: List<Int> = arrInput?.split(" ")?.mapNotNull { it.toIntOrNull() } ?:return
        arr=arr.sorted()
        println("${arr[0]} ${arr[1]} ${arr[6] - arr[0] -arr[1]}")
        --a
    }

}
