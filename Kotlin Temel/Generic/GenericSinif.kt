package Generic

class StringDiziYaz{

    fun diziYazdir(dizi:Array<String>){

        for (i in dizi){
            println(i)
        }
    }
}

class IntegerDiziYaz{

    fun diziYazdir(dizi:Array<Int>){

        for (i in dizi){
            println(i)
        }
    }
}

class GenericDiziYaz<Genel>(var dizi:Array<Genel>){

    fun diziYazdir(){

        for (i in dizi){
            println(i)
        }

    }

}

fun main(args: Array<String>) {

    var stringDizi:Array<String> = arrayOf("selamet","hayri","vartolu")
    var intDizi=arrayOf(1,2,3,4,5)

    /* var stringDiziyazSinif=StringDiziYaz()
     stringDiziyazSinif.diziYazdir(stringDizi)

     var intDiziYaz:IntegerDiziYaz= IntegerDiziYaz()
     intDiziYaz.diziYazdir(intDizi)
 */
    var g1=GenericDiziYaz(stringDizi)
    g1.diziYazdir()

    var g2=GenericDiziYaz(intDizi)
    g2.diziYazdir()


}