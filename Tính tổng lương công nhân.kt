fun main() {
    var s:Long=0
    while (true){
        var n:Long= readln().toLong()
        if (n==-1.toLong()){
            break
        }
        else{
            s+=n
        }
    }
    print(s)
}
