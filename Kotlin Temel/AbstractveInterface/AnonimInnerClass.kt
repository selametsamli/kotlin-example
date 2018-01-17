package AbstractveInterface

interface Okuyabilen{

    fun oku(){}

}

class Tarayici:Okuyabilen{

    override fun oku() {
        println("Tarayici sınıfından oku methodu tetiklendi")
    }

}

fun main(args: Array<String>) {

    var tarayici=Tarayici()
    tarayici.oku()

    var isimsizSinif=object :Okuyabilen{

        override fun oku() {
            println("İsimsiz sınıftaki oku methodu ")
        }

    }

    isimsizSinif.oku()

}