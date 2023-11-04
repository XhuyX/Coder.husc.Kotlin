fun main() {
    var n:Int= readln().toInt()
    var s:Long=0
    
    var input= readln().split(" ")
    if (input!=null){
        for (i in 0 until n){
            s+= input[i].toLong()
        }
        print(s)
    }

}
