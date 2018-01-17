package Kalitim

open class GeometrikSekil{

    var en : Int=0
    var boy : Int=0

    open fun alanHesapla(){

        println("Geometrik Şekil Alan: "+(en*boy))

    }

    override fun toString(): String {
        return "En: $en Boy: $boy"
    }
}

class Kare:GeometrikSekil() {

    override fun alanHesapla() {
        println("Kare Alan: "+(en*boy))
    }


}

class Dikdortgen:GeometrikSekil(){

    override fun alanHesapla() {
        println("Didörtgen Alan: "+(en*boy))
    }

}

fun main(args: Array<String>) {

    var gs1=GeometrikSekil()
    gs1.boy=6
    gs1.en=3
    gs1.alanHesapla()

    var k1=Kare()
    k1.boy=5
    k1.en=5
    k1.alanHesapla()

    var d1=Dikdortgen()
    d1.boy=15
    d1.en=4
    d1.alanHesapla()


}