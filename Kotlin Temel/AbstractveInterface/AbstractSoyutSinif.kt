package AbstractveInterface

abstract class Calisan {

    open var pozisyon:String="Çalışan"

    abstract fun calis()

    open fun soyutOlmayanMethod(){
        println("Soyut Olmayan Method")

    }

}

open class Mudur:Calisan(){

    override var pozisyon: String="Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

    override fun soyutOlmayanMethod() {
        println("Müdür Soyut olmayan methodu override etti")
    }


}

class GenelMudur:Mudur(){
    override var pozisyon: String="Genel Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

}

open class Programci:Calisan(){

    override var pozisyon: String="Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }
}

class AnalizProgramci:Programci(){

    override var pozisyon: String="Analiz Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }


}

class SistemProgramci:Programci(){

    override var pozisyon: String="Sistem Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

    open fun sistemiIncele(){

        println("Sistemi inceliyor ")

    }


}

class Pazarlamaci:Calisan(){

    override var pozisyon: String="Pazarlamaci"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }


}

fun main(args: Array<String>) {

    /* var calisanlar=Array<Any>(4){Any()}

     calisanlar[0]=Calisan() // Yukarı çevrim upcasting
     calisanlar[1]=Mudur()
     calisanlar[2]=Programci()
     calisanlar[3]=Pazarlamaci() */

    var calisanlar=Array<Calisan>(7){ SistemProgramci() }

    calisanlar[0]=Pazarlamaci() // Yukarı çevrim upcasting
    calisanlar[1]=Mudur()
    calisanlar[2]=Programci()
    calisanlar[3]=Pazarlamaci()
    calisanlar[4]=GenelMudur()
    calisanlar[5]=AnalizProgramci()
    calisanlar[6]=SistemProgramci()

    //mesaiyeBasla(calisanlar)
    mesaiyeBaslaPolimorfizm(calisanlar)

}

fun mesaiyeBasla(calisanlar: Array<Any>) {

    for (oankiCalisan in calisanlar){

        if (oankiCalisan is Calisan){
            var calisan:Calisan=oankiCalisan // aşağıya çevirme
            calisan.calis()
        }else if(oankiCalisan is Mudur){
            var mudur:Mudur=oankiCalisan
            mudur.calis()
        }else if(oankiCalisan is Programci){
            var programci:Programci=oankiCalisan
            programci.calis()
        }else if (oankiCalisan is Pazarlamaci){
            var pazarlamaci:Pazarlamaci=oankiCalisan
            pazarlamaci.calis()
        }

    }

}

fun mesaiyeBaslaPolimorfizm(calisanlar: Array<Calisan>){

    for(oankiCalisan in calisanlar){
        oankiCalisan.calis()

        if (oankiCalisan is SistemProgramci){
            oankiCalisan.sistemiIncele()
        }

    }


}
