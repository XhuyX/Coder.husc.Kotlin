fun main() {
    val sizeInput = readLine()
    var t: Int = sizeInput?.toIntOrNull() ?:0
    while (t!=0){
        var xx = readLine()
        var n = xx?.toIntOrNull() ?:0
        var yy = readLine()
        var a = yy?.split(" ")?.mapNotNull { it.toIntOrNull() }?.sorted()?:return
        var zz = readLine()
        var b = zz?.split(" ")?.mapNotNull { it.toIntOrNull() }?.sorted()?:return

        if (a != null && b != null) {
            var check = true
            for (i in 0 until n) {
                if (a[i] > b[i]) {
                    check = false
                    break
                }
            }
            if (check) {
                println("Yes")
            } else {
                println("No")
            }
        }
        --t
    }

}
