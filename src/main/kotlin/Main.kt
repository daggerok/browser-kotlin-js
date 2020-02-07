import kotlinx.html.button
import kotlinx.html.dom.create
import kotlinx.html.js.button
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import kotlinx.html.onClick
import kotlinx.html.p
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    val div = document.create.div {
        p {
            +"Okay..."
        }
        p {
            + "Open dev tools and click the button!"
        }
        button {
            +"Click me..."
            onClickFunction = {
                println("Who-hoo! ${it.type}")
            }
        }
    }
    document.addEventListener("DOMContentLoaded", {
        console.log("Are you ready for a good jam?")
        document.querySelector("#app")?.let {
            window.setTimeout({
                it.textContent = "Хола! Их бин Максимко O.o"
                it.appendChild(div)
            }, 1234)
        }
    }, false)
}
