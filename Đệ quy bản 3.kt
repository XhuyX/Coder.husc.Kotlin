fun dequy(m:Long, n: Long):Long{
    if (m==0.toLong()){
        return (n+1).toLong()
    }
    else if (m>0 && n==0.toLong()){
        return dequy(m-1,1)
    }
    else if (m>0 && n>0){
        return dequy(m-1,dequy(m,n-1))
    }
    return  -1
}
fun main() {
    var x = readLine()?.split(" ")
    if (x!=null ){
        var m= x[0].toLong()
        var n = x[1].toLong()
        print( dequy(m,n))
    }
    else{
        return
    }
}
