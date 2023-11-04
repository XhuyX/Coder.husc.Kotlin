fun main() {
    var n:Long= readln().toLong()
    var s:Long=1
    if (n==0.toLong() || n==1.toLong()){
        print(1)
        return
    }
    else if (n % 2.toLong() ==0.toLong() ) {
        for (i in 2..n step 2) {
            s *= i
        }
    }
    else{
        for (i in 3..n step 2){
            s*=i
        }
    }
    print(s)

}
