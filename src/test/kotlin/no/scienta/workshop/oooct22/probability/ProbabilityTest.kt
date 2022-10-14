package no.scienta.workshop.oooct22.probability

import no.scienta.workshop.oooct22.probability.Probability.Companion.outOf
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals

class ProbabilityTest {

    companion object {
        private val CERTAIN = 1 outOf 1
        private val IMPOSSIBLE = 0 outOf 1
        private val LIKELY = 3 outOf 4
        private val UNLIKELY = 1 outOf 4
        private val EQUALLY_LIKELY = 1 outOf 2
    }

    @Test
    fun equals() {
        assertEquals(CERTAIN, CERTAIN)
        assertEquals(EQUALLY_LIKELY, 1 outOf 2)
        assertNotEquals(LIKELY, UNLIKELY)
        assertNotEquals(IMPOSSIBLE, null)
    }
}
