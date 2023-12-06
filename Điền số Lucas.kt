fun main() {
    val arr = Array <Long> (82) {0}
    arr[0]=2
    arr[1]=1
    for (i in 2..80){
        arr[i]= arr[i-1] + arr[i-2]
    }
    val n:Short = readln().toShort()
    for (i in 0..n){
        print("${arr[i]} ")
    }
}
