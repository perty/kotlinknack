import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.span
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    setOnLoadInject()
    println("Done load set up!")
}

fun setOnLoadInject() {
    window.onload = {
        document.body!!.append.div {
            span {
                +"Hello from Kotlin"
            }
        }
    }
}
