fun drawBox(width: Int, height: Int): String {
    var box = ""
    val horizontalEdges = " - ".repeat(width -2)
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
    return box
}