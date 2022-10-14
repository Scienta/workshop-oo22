package no.scienta.workshop.oooct22.quantity

class Quantity(private val amount: Double, private val unit: Unit) {

    private constructor(amount: Number, unit: Unit) : this(amount.toDouble(), unit)



    companion object {
        val Int.tablespoon get() = Quantity(this, Tablespoon)
        val Int.teaspoon get() = Quantity(this, Teaspoon)
        val Int.ounce get() = Quantity(this, Ounce)
        val Int.foot get() = Quantity(this, Foot)
        val Int.inch get() = Quantity(this, Inch)
    }

    override fun equals(other: Any?) = this === other || other is Quantity && equals(other)

    private fun equals(other: Quantity) =
        unit.compatible(other.unit)
                && this.amount == other.convertTo(this.unit).amount

    private fun convertTo(target: Unit) =
        Quantity(target.convert(amount, unit), target)

    override fun hashCode() = unit.hashOf(amount)

    override fun toString() = "$amount $unit"

}
