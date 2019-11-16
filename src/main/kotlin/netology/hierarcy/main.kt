package netology.hierarcy

import netology.hierarcy.view.ViewGroup
import netology.hierarcy.widget.Button
import netology.hierarcy.widget.TextView

fun main() {
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    println("Нажми на кнопку:")
    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)
    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}