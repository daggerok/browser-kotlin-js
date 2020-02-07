import kotlin.browser.document
import kotlin.browser.window

fun main() {
    document.addEventListener("DOMContentLoaded", {
        console.log("Are you ready for a good jam?")
        document.querySelector("#app")?.let {
            window.setTimeout({
                it.textContent = "Хола! Их бин Максимко O.o"
            }, 1234)
        }
    }, false)
}
