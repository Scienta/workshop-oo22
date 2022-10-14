package no.scienta.workshop.oooct22.quantity

import no.scienta.workshop.oooct22.quantity.CookingVolume.Companion.tablespoon
import no.scienta.workshop.oooct22.quantity.CookingVolume.Companion.teaspoon
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CookingVolumeTest {

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
    }

}
