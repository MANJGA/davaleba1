fun main() {

    var f1 = Fraction(3F,9F)

    var f2 = Fraction(2F,6F)

    println(f1)
    println(f1.sum(f1,f2))
    println(f1.gayofa(f1,f2))
    println(f1.shekveca(3F))

}

class Fraction(private var numerator: Float, private var denominator: Float) {

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    //davalebis metodebi:
    //ikveceba mxolod mtel ricxvebze
    fun shekveca (gamyofi: Float): String {

        var n = numerator / gamyofi
        var d = denominator / gamyofi
        return "shekvecili wiladi: $n/$d"
    }

    //wilads emateba mxolod mteli ricxvebi

    fun sum (a: Fraction, b:Fraction): String {
        var n1 = a.numerator * b.denominator
        var n2 = b.numerator * a.denominator
        var d1 = a.denominator * b.denominator

        return "wiladebis jami: ${n1 + n2}/$d1"
    }

    fun gayofa (a: Fraction, b:Fraction): String {
        var n = a.numerator * b.denominator
        var d = a.denominator * b.numerator

        return "gayofis shedegi: $n/$d"
    }
}