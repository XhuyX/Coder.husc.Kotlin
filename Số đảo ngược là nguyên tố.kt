import kotlin.math.sqrt

fun tol(a : Long):Boolean{
    var S:Long=0
    var x=a
    while (x>0){
        S=S*10 + x%10
        x/=10
    }
    return isprime(S)
}
fun isprime(n:Long):Boolean{
    if(n<2){
        return false
    }
    for(i in 2.. sqrt(n.toDouble()).toInt()){
        if (n%i==0.toLong()){
            return false
        }
    }
    return true
}
fun main() {
    val n:Short= readLine()?.toShort()?:return
    for (i in 0 until n){
        val x:Long= readLine()?.toLong()?:return
        if (tol(x)){
            println("Yes")
        }
        else{
            println("No")
        }
    }
}
