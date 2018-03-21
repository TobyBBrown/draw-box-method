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

    @Test
    fun drawBoxZero() {
        assertThrows(IllegalArgumentException::class.java, {drawBox(0, 0)})
        assertThrows(IllegalArgumentException::class.java, {drawBox(5, 0)})
        assertThrows(IllegalArgumentException::class.java, {drawBox(0, 5)})
    }

    @Test
    fun drawBoxLine() {
        assertThrows(IllegalArgumentException::class.java, {drawBox(1, 1)})
        assertThrows(IllegalArgumentException::class.java, {drawBox(5, 1)})
        assertThrows(IllegalArgumentException::class.java, {drawBox(1, 5)})
    }

    @Test
    fun drawBoxNegative() {
        assertThrows(IllegalArgumentException::class.java, {drawBox(1, 1)})
        assertThrows(IllegalArgumentException::class.java, {drawBox(5, 1)})
        assertThrows(IllegalArgumentException::class.java, {drawBox(1, 5)})
    }

}