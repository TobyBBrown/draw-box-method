import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DrawBoxKtTest {

    @Test
    fun drawBox() {
        val expected = "\u250c  -  -  \u2510" +
                "\n\u2502        \u2502" +
                "\n\u2502        \u2502" +
                "\n\u2514  -  -  \u2518\n"
        assertEquals(expected, drawBox(4, 4))
    }

}