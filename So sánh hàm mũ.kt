import kotlin.math.abs
fun main() {
    val input = readLine()
    val (a, b, mu) = input?.split(" ")?.map { it.toInt() } ?: return
    if (mu%2==0 ){
        if (abs(a)==abs(b)) print("=")
        else if (abs(a)> abs(b)){
            print(">")
        }
        else{
            print("<")
        }
    }
    else{
        if(a>b){
            print(">")
        }
        else if (a==b){
            print("=")
        }
        else{
            print("<")
        }
    }
}
