package no.scienta.workshop.oooct22.probability

import java.math.BigDecimal
import java.math.RoundingMode

//Understands the likelihood of something occuring
class Probability(private val fraction: BigDecimal) {

    init {
        require(fraction.scale() == SCALE)
        require(fraction in IMPOSSIBLE_FRACTION .. CERTAIN_FRACTION)
    }

    override fun equals(other: Any?) =
        this === other || other is Probability && this.equals(other)

    private fun equals(other: Probability) =
        this.fraction == other.fraction

    override fun hashCode() =
        fraction.hashCode()

    operator fun not() =
        Probability(CERTAIN_FRACTION - fraction)


    companion object {
        private const val SCALE = 5
        private val IMPOSSIBLE_FRACTION = BigDecimal.ZERO
        private val CERTAIN_FRACTION = BigDecimal.ONE

        infix fun Number.outOf(total: Number) =
            (this.toDouble() / total.toDouble())
                .let(Double::toBigDecimal)
                .setScale(SCALE, RoundingMode.HALF_UP)
                .let(::Probability)
    }

}
