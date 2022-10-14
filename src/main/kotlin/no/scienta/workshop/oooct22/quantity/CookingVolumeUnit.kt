package no.scienta.workshop.oooct22.quantity

/*
   - 1 tablespoon = 3 teaspoons
   - 1 ounce = 2 tablespoons
   - 1 cup = 8 ounces
   - 1 pint = 2 cups
   - 1 quart = 2 pints
   - 1 gallon = 4 quarts
    */

sealed class CookingVolumeUnit(private val numberOfTeaspoons: Int,
                               private val shortName:String) {
    fun numberOfTeaspoons(amount: Int) = amount * this.numberOfTeaspoons
    override fun toString() = shortName
}
object Tablespoon : CookingVolumeUnit(3, "tbs")
object Teaspoon : CookingVolumeUnit(1, "tsp")

