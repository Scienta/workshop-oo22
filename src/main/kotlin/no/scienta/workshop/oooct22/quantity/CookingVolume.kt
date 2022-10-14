package no.scienta.workshop.oooct22.quantity

class CookingVolume(private val amount: Int, private val unit: CookingVolumeUnit) {

    companion object {
        val Int.tablespoon get() = CookingVolume(this, Tablespoon)
        val Int.teaspoon get() = CookingVolume(this, Teaspoon)
    }
    override fun equals(other: Any?) = this === other || other is CookingVolume && equals(other)

    private fun equals(other: CookingVolume) =
        numberOfTeaspoons() == other.numberOfTeaspoons()

    override fun hashCode() = numberOfTeaspoons()

    private fun numberOfTeaspoons() = this.unit.numberOfTeaspoons(this.amount)

    override fun toString() = "$amount $unit"

}
