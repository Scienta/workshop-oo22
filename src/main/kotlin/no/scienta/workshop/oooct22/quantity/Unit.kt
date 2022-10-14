package no.scienta.workshop.oooct22.quantity

/*
   - 1 tablespoon = 3 teaspoons
   - 1 ounce = 2 tablespoons
   - 1 cup = 8 ounces
   - 1 pint = 2 cups
   - 1 quart = 2 pints
   - 1 gallon = 4 quarts

   12 inches = 1 foot
    3 feet = 1 yard
    6 feet = 1 fathom
    22 yards = 1 chain
    10 chains = 1 furlong
    8 furlongs = 1 mile
    3 miles = 1 league
    */

sealed class Unit(
    private val shortName: String,
    baseUnit: Unit? = null,
    private val numberOfBaseUnits: Int = 1,
) {
    private val baseUnit : Unit = baseUnit ?: this


    constructor(
        shortName: String,
        rate: Int,
        rateUnit: Unit
    ) : this( shortName, rateUnit.baseUnit, rate * rateUnit.numberOfBaseUnits)

    fun compatible(other: Unit) : Boolean =
        this.baseUnit == other.baseUnit

    fun numberOfBaseUnits(amount: Double) = amount * this.numberOfBaseUnits
    override fun toString() = shortName
}

object Teaspoon : Unit("tsp")
object Tablespoon : Unit("tbs", 3, Teaspoon)
object Ounce : Unit("oz. fl", 2, Tablespoon)

object Inch : Unit("inch")
object Foot : Unit("foot",12 ,Inch)

