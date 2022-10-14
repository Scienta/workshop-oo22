package no.scienta.workshop.oooct22.quantity

class CookingVolume(private val amount: Int, private val unit: CookingVolumeUnit) {


    override fun equals(other: Any?) = this === other || other is CookingVolume && equals(other)

    private fun equals(other: CookingVolume) =
        this.unit.numberOfTeaspoons(this.amount) == other.unit.numberOfTeaspoons(other.amount)

    override fun hashCode() = unit.numberOfTeaspoons(amount)

    override fun toString() = "$amount $unit"

}
