fun drawBox(width: Int, height: Int): String {
    var box = ""
    val horizontalEdges = " - ".repeat(width -2)
    val topRow = "\u250c $horizontalEdges \u2510\n"
    val bottomRow = "\u2514 $horizontalEdges \u2518\n"
    val middleRows = "\u2502 " + "   ".repeat(width - 2) + " \u2502\n"
    for (i in 1..height) {
        if (i == 1)
            box += topRow
        else if (i == height)
            box += bottomRow
        else
            box += middleRows
    }
    return box
}