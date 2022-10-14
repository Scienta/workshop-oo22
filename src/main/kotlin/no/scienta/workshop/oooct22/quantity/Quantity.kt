package no.scienta.workshop.oooct22.quantity

class Quantity(private val amount: Int, private val unit: Unit) {

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
                && numberOfBaseUnits() == other.numberOfBaseUnits()

    override fun hashCode() = numberOfBaseUnits()

    private fun numberOfBaseUnits() = this.unit.numberOfBaseUnits(this.amount)

    override fun toString() = "$amount $unit"

}
