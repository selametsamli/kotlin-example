package Kalitim

open class Asker {

    open fun selamVer(){

        println("Asker selam verdi")

    }
}

class Er:Asker(){

    override fun selamVer() {
        println("Er selam verdi")
    }


}

class Yuzbasi:Asker(){

    override fun selamVer() {
        println("Yüzbaşı selam verdi")
    }
}

fun main(args: Array<String>) {

    var asker=Asker()
    var er=Er()
    var yuzBasi=Yuzbasi()

    hazirOl(asker)
    hazirOl(er)
    hazirOl(yuzBasi)

}

fun hazirOl(asker:Asker){

    asker.selamVer()

}