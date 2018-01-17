package AbstractveInterface

object Ogr{
    //statik davranış gösterirler
    var sayac:Int=0

    fun sayaciGoster(){

        println("Sayac: "+ sayac)

    }




}

fun main(args: Array<String>) {

    var ogr:Ogr=Ogr
    ogr.sayaciGoster()
    ogr.sayac=8
    ogr.sayaciGoster()

    var ogr2:Ogr=Ogr
    ogr2.sayac=18
    ogr.sayaciGoster()


}