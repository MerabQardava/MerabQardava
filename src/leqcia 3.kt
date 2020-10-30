fun main(){
    val rav4: CarFactory = CarFactory()
    rav4.name= "Toyota Rav4"
    rav4.color = "yellow"
    rav4.withTurbo=false
    rav4.year= 2017
    rav4.maxSpeed = 180

    rav4.printCarInfo()
    rav4.coloring("black")
    rav4.printCarInfo()

//    val tucson: CarFactory = CarFactory()

    var rav4_1=rav4
    rav4_1.coloring("white")
    rav4_1.printCarInfo()

}

class carFactory {

    var name: String = ""
    var maxSpeed: Int = 0
    var year: Int =0
    var withTurbo: Boolean =false
    var color: String = ""

    fun printCarInfo(){
        println("$name - $year -$color ")

    }

    fun coloring (color: String){
        if (color==this.color){
            println("same color")
        }else{
            println("coloring....")
            this.color=color
        }
    }



}
