fun main() {
    var n:Int = readln().toInt()
    var s:String = readln()
    var cnt:Short=0
    var dem:Int=0
    for (i in s){
        if (i=='1'){
            cnt=2
            ++dem
        }
        else{
            if (cnt>0){
                --cnt
                ++dem
            }
        }
    }
    print(dem)
}
