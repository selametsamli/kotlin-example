package Kalitim

class ArabaMotoru(){

    fun calis(){}
    fun dur(){}

}

class Pencere(){

    fun asagiCek(){}
    fun yukariCek(){}

}

class Kapi(){
    var pencere:Pencere= Pencere()

    fun ac(){}
    fun kapa(){}


}

class Tekerlek(){

    fun havaPompala(miktar:Int){}

}

class Araba(){

    var arabaMotor=ArabaMotoru() //çoklu kalıtıma izin vermez tek bir class içersinde nesneler tanımlanarak bu işlem yapılır.
    var sagKapi:Kapi=Kapi()
    var solKapi:Kapi=Kapi()

    var tekerlekler:Array<Tekerlek> =Array<Tekerlek>(4){Tekerlek()}

}

fun main(args: Array<String>) {

    var arabam:Araba=Araba()
    arabam.sagKapi.pencere.asagiCek()
    arabam.solKapi.pencere.yukariCek()

    arabam.tekerlekler[2].havaPompala(50)

}