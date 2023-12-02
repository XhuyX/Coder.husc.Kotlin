fun main() {
    val n = readLine()
    var a : List <Int> = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() }?:return
    var b= a.filter { it%2==0 }
    var c=a.filter { it%2!=0 }
    print(b.sorted().joinToString (" "))
    print(" ")
    print(c.sorted().joinToString(" "))
}
