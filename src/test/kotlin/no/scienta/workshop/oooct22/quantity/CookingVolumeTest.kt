package no.scienta.workshop.oooct22.quantity

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
        assertEquals(CookingVolume(1, Tablespoon), CookingVolume(1, Tablespoon))
        assertEquals(CookingVolume(1, Tablespoon).hashCode(), CookingVolume(1, Tablespoon).hashCode())
        assertEquals(CookingVolume(3, Teaspoon), CookingVolume(1, Tablespoon))
        assertEquals(CookingVolume(3, Teaspoon).hashCode(), CookingVolume(1, Tablespoon).hashCode())
    }

}
