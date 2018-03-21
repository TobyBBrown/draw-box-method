import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DrawBoxKtTest {

    @Test
    fun drawBoxSquare() {
        val expected = "\u250c  -  -  \u2510" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2514  -  -  \u2518\n"
        assertEquals(expected, drawBox(4, 4))
    }

    @Test
    fun drawBoxVertRectangle() {
        val expected = "\u250c  -  -  \u2510" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2514  -  -  \u2518\n"
        assertEquals(expected, drawBox(4, 8))
    }

    @Test
    fun drawBoxHoriRectangle() {
        val expected = "\u250c  -  -  -  -  -  -  \u2510" +
                "\n\u2502                    \u2502" +
                "\n\u2502                    \u2502" +
                "\n\u2514  -  -  -  -  -  -  \u2518\n"
        assertEquals(expected, drawBox(8, 4))
    }

}