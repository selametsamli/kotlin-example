package OzelFonksiyonlar

class Ogr{

    var yetenek:String?=null

    fun yetenekYazdir(){
        println(yetenek)
    }

}

fun main(args: Array<String>) {

    var selamet= Ogr()
    selamet.yetenek="Kotlin"
    selamet.yetenekYazdir()

    var hayri=Ogr()
    hayri.yetenek="Android"
    hayri.yetenekYazdir()

    var ali:Ogr=selamet yenetekBirlesitir hayri

    ali.yetenekYazdir()


}

infix fun Ogr.yenetekBirlesitir(hasan:Ogr):Ogr{

    var olusturulanOgrNesnesi:Ogr=Ogr()

    olusturulanOgrNesnesi.yetenek=this.yetenek+" "+ hasan.yetenek

    return olusturulanOgrNesnesi


}