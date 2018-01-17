package AbstractveInterface

class DisSinif{

    var sinifAdi:String="Dış Sınıf"

    fun selamVerDisSinif(){
        println("Dış Sınıftan Merhabalarrr")
    }

    inner class IcSinif{
        var sinifAdi="İç Sınıf"
        fun selamVerIcSinif(){
            println("İç Sınıftan Merhaba")

        }

        inner class EnIctekiSinif{
            fun enIctekiMethod(){
                selamVerDisSinif()
                selamVerIcSinif()
                println("En içteki sınıftan merhabalar")

            }

        }

    }

}

fun main(args: Array<String>) {

    var disSinif=DisSinif()
    disSinif.selamVerDisSinif()
    println(disSinif.sinifAdi)

   // var icSinif=DisSinif.IcSinif()

    var icSinif=DisSinif().IcSinif()
    icSinif.selamVerIcSinif()
    println(icSinif.sinifAdi)

    var enIcSinif=DisSinif().IcSinif().EnIctekiSinif()
    enIcSinif.enIctekiMethod()

}