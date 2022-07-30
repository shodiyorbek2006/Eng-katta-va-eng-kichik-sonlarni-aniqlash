import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    if (a > b && a > c) {
        println(c)
        println(a)
    }
    if (b > a && b > c) {
        println(c)
        println(b)
    } else if (c > a && c > b) {
        println(a)
        println(c)
    }
}