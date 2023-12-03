fun main() {
    val input = readLine()
    val (a, b, k) = input?.split(" ")?.map { it.toLong() } ?: return

    if (a>=k){
        print("${a-k} ${b}")}
    else if (a-k+b>=0){
        print("0 ${a-k+b}")}
    else
    { print("0 0")}
}
