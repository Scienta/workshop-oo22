package no.scienta.workshop.oooct22.quantity

class CookingVolume(private val amount: Int, private val unit: CookingVolumeUnit) {

    override fun equals(other: Any?) = this === other || other is CookingVolume && equals(other)

    private fun equals(other: CookingVolume) = this.amount == other.amount && this.unit == other.unit

    override fun hashCode() = (amount to unit).hashCode()

    override fun toString() = "$amount $unit"

}
