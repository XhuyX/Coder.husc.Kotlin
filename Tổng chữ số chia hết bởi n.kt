fun main() {
    var s:Long=0
    var n:Long= readln().toLong()
    val x =n
    while (n!=0.toLong()){
        s+= n%10
        n/=10
    }
    if (x%s==0.toLong()){
        print("Yes")
    }
    else{
        print("No")
    }

}
