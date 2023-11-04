import kotlin.math.sqrt

fun main() {
    var n:Long= readln().toLong()
    var s:Long=-n
    for (i in 1..sqrt(n.toDouble()).toLong()){
        if (n%i==0.toLong()){
            s+=i
            if (i!= n/i){
                s+=n/i
            }
        }
    }
    if (s>n){
        print("YES")
    }
    else{
        print("NO")
    }
}
