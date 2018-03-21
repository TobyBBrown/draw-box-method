fun drawBox(width: Int, height: Int): String {
    var box = ""
    if (width > 1 && height > 1) {
        val horizontalEdges = " - ".repeat(width - 2)
        val topRow = "\u250c $horizontalEdges \u2510\n"
        val bottomRow = "\u2514 $horizontalEdges \u2518\n"
        val middleRows = "\u2502 " + "   ".repeat(width - 2) + " \u2502\n"
        for (i in 1..height) {
            box += when (i) {
                1 -> topRow
                height -> bottomRow
                else -> middleRows
            }
        }
    } else
        throw IllegalArgumentException("A box must have at least width 2 and height 2.")
    return box
}

fun main(args: Array<String>) {
    print(drawBox(4, 4))
}