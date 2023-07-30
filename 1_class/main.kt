data class ViewLog(var browser: String, var siteUrl: String, var location: String)

fun main() {
    val log = ViewLog("Mozilla Firefox", "http://localhost:8000", "Philippines")
    val secondLog = log.copy(browser="Google Chrome")
    println(log)
    println(secondLog)
}
