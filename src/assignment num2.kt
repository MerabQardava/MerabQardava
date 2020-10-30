import java.lang.Float.max
fun main() {

    var f1 = Fraction()
    f1.numerator = 8f
    f1.denominator = 16f
    f1.simplifying()
    println(f1)
}
class Fraction() {
    var numerator: Float = 1f
    var denominator: Float = 2f
    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }
    override fun toString(): String {
        return "$numerator/$denominator"
    }
    fun multiplication(other: Fraction): Fraction {
        var y = denominator * other.denominator
        var x = numerator * other.numerator
        var prod = Fraction()
        prod.numerator = x
        prod.denominator = y
        return prod
    }
    fun addition(other: Fraction): Fraction {
        val y = denominator * other.denominator
        val x = (numerator * other.denominator) + (other.numerator * denominator)
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3
    }
    fun simplifying(): Float {
        fun maxD(): Float {
            val m = max(numerator, denominator)
            var maxD = 1
            for (i in m.toInt() downTo 0) {
                if (numerator.toInt() % i == 0 && denominator.toInt() % i == 0) {
                    maxD = i
                    break
                }
            }
            return maxD.toFloat()
        }
        val max= maxD()
        numerator /= max
        denominator /= max
        return numerator; denominator
    }
}








