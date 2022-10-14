package no.scienta.workshop.oooct22.quantity

/*
   - 1 tablespoon = 3 teaspoons
   - 1 ounce = 2 tablespoons
   - 1 cup = 8 ounces
   - 1 pint = 2 cups
   - 1 quart = 2 pints
   - 1 gallon = 4 quarts
    */

sealed class CookingVolumeUnit(
    private val shortName: String,
    private val numberOfTeaspoons: Int = 1 ) {

    constructor(
        shortName: String,
        numberOfBaseUnits: Int,
        baseUnit: CookingVolumeUnit) : this( shortName,
        numberOfBaseUnits * baseUnit.numberOfTeaspoons
    )

    fun numberOfTeaspoons(amount: Int): Int = amount * this.numberOfTeaspoons
    override fun toString() = shortName
}

object Teaspoon : CookingVolumeUnit("tsp")
object Tablespoon : CookingVolumeUnit("tbs", 3, Teaspoon)
object Ounce : CookingVolumeUnit("oz. fl", 2, Tablespoon)

