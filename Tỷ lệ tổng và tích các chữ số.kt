fun main() {
    var n= readLine()?.toLong()?:0
    var tong:Long=0
    var tich:Double=1.0
    var r:Long=0
    while (n!=0.toLong()){
        r= n%(10)
        tong+=r
        tich*=r
        n/=10
    }
    print("%.3f".format(tich/tong))
}
