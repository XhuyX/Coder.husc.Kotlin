fun main() {
    var n: String?
    while (true) {
        n = readLine()
        if (n.isNullOrEmpty()) { // Kiểm tra chuỗi rỗng hoặc null
            break
        } else {
            var c = true
            var l = 0
            var r = n.length - 1
            while (l <= r) {
                if (!n[l].isLetter()) {
                    l++
                    continue // Bỏ qua các ký tự không phải chữ cái
                }
                if (!n[r].isLetter()) {
                    r--
                    continue // Bỏ qua các ký tự không phải chữ cái
                }
                if (n[l].lowercaseChar() != n[r].lowercaseChar()) {
                    c = false
                    break
                }
                l++
                r--
            }
            if (c) {
                println("Yes")
            } else {
                println("No")
            }
        }
    }
}
