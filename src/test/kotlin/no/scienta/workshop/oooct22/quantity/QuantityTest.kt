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
        infix fun Quantity.shouldBe(other: Quantity) {
            assertEquals(this, other)
            assertEquals(this.hashCode(), other.hashCode())
        }

        infix fun Quantity.shouldNotBe(other: Quantity) =
            assertNotEquals(this, other)


        1.tablespoon shouldBe 1.tablespoon
        3.teaspoon shouldBe 1.tablespoon
        3.ounce shouldBe 6.tablespoon
        1.ounce shouldBe 6.teaspoon
        12.inch shouldBe 1.foot
        11.inch shouldNotBe 1.foot
        1.teaspoon shouldNotBe 1.inch
    }
}
