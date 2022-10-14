package no.scienta.workshop.oooct22.quantity

import no.scienta.workshop.oooct22.quantity.Quantity.Companion.foot
import no.scienta.workshop.oooct22.quantity.Quantity.Companion.inch
import no.scienta.workshop.oooct22.quantity.Quantity.Companion.ounce
import no.scienta.workshop.oooct22.quantity.Quantity.Companion.tablespoon
import no.scienta.workshop.oooct22.quantity.Quantity.Companion.teaspoon

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class QuantityTest {

    /*
	- 1 tablespoon = 3 teaspoons
	- 1 ounce = 2 tablespoons
	- 1 cup = 8 ounces
	- 1 pint = 2 cups
	- 1 quart = 2 pints
	- 1 gallon = 4 quarts
     */

    @Test
    fun equality() {
        assertEquals(1.tablespoon, 1.tablespoon)
        assertEquals(1.tablespoon.hashCode(), 1.tablespoon.hashCode())
        assertEquals(3.teaspoon, 1.tablespoon)
        assertEquals(3.teaspoon.hashCode(), 1.tablespoon.hashCode())
        assertEquals(1.ounce, 6.teaspoon)
        assertEquals(12.inch, 1.foot)
        assertNotEquals(11.inch, 1.foot)

        assertNotEquals(1.teaspoon, 1.inch)
    }
}
