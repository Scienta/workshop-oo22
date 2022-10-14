package no.scienta.workshop.oooct22.probability

import java.math.BigDecimal
import java.math.RoundingMode

//Understands the likelihood of something occuring
class Probability(fraction: BigDecimal) {

    private val fraction = fraction
        .setScale(SCALE, RoundingMode.HALF_UP)
        .also { require(it in IMPOSSIBLE_FRACTION..CERTAIN_FRACTION) }

    override fun equals(other: Any?) =
        this === other || other is Probability && this.equals(other)

    private fun equals(other: Probability) =
        this.fraction == other.fraction

    override fun hashCode() =
        fraction.hashCode()

    override fun toString() = fraction.toString()

    operator fun not() =
        Probability(CERTAIN_FRACTION - fraction)

    infix fun and(other: Probability) =
        Probability(this.fraction * other.fraction)

    infix fun or(other: Probability) =
        !(!this and !other)


    companion object {
        private const val SCALE = 5
        private val IMPOSSIBLE_FRACTION = BigDecimal.ZERO
        private val CERTAIN_FRACTION = BigDecimal.ONE

        infix fun Number.outOf(total: Number) =
            (this.toDouble() / total.toDouble())
                .let(Double::toBigDecimal)
                .let(::Probability)
    }

}
