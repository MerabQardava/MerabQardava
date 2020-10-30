
fun main (){

    val a= Point()
    a.x=5f
    a.y=6f
    a.symmetry()
    println(a)


    val b= Point()
    b.x=6f
    b.y=6f
    println(b)
    print(b==a)
}

class Point{
    var x:Float = 0f
    var y:Float = 0f
    override fun toString(): String {
        return "ამ წერტილის კოირდინატებია x=$x y=$y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if((x==other.x) and (y==other.y)) {
                return true
            }
        }
        return false
    }
    fun symmetry (){
        y=-y
        return println("სიმეტრიული y ღერძის მიმართ არის($x , $y) ")

    }


}
