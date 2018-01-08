package DataClassGetterSetter

class Kisi(val id:Int,val isim:String){


    /* override fun toString(): String {
         return "id: $id isim: $isim"
     }

     */
}

data class KisiData(val id:Int,val isim:String){


}

fun main(args: Array<String>) {

    val selamet=Kisi(1,"Selamet")
    val hayri=Kisi(2,"Hayri")
    val selametKopya:Kisi=selamet
    val test=Kisi(1,"Selamet")

    println(selamet)//toString
    println(selamet.hashCode())
    println(selamet.equals(hayri))
    println(selamet.equals(selametKopya))
    println(selamet.equals(test))

    val selametD=KisiData(1,"Selamet")
    val hayriD=KisiData(2,"Hayri")
    val selametKopyaD:KisiData=selametD
    val testD=KisiData(1,"Selamet")

    println(selametD)//toString
    println(selametD.hashCode())
    println(selametD.equals(hayriD))
    println(selametD.equals(selametKopyaD))
    println(selametD.equals(testD))

    val kopyaHayri:KisiData=hayriD.copy()
    println("Kopya Hayri "+kopyaHayri)
    println("Kopya hayri id değişik "+ hayriD.copy(id=53))

    var(id,isim)=selametD

    println("$id $isim")


}
