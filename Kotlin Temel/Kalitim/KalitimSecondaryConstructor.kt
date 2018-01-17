package Kalitim

open class Person2{

    var isim:String
    var yas:Int
    var isMan:Boolean=false

    constructor(isim:String,yas:Int){

        this.isim=isim
        this.yas=yas

    }
    constructor(isim:String,yas:Int,isMan:Boolean):this(isim,yas){
        this.isMan=isMan
    }

    override fun toString(): String {
        var cinsiyet=if (isMan)"erkek" else "kadın"

        return "İsim $isim Yaş: $yas Cinsiyet: $cinsiyet"
    }
}


class Ogretmen2:Person2{

    var brans:String

    constructor(isim:String,yas:Int,isMan:Boolean,brans:String):super(isim, yas, isMan){

        this.brans=brans

    }

    override fun toString(): String {
        var cinsiyet=if (isMan)"erkek" else "kadın"

        return "İsim $isim Yaş: $yas Cinsiyet: $cinsiyet Branş: $brans"
    }


}

fun main(args: Array<String>) {

    var p1=Person2("Selamet",21,true)
    println(p1.toString())

    var p2=Person2("Ezgi",22)
    println(p2.toString())

    var ogr1=Ogretmen2("Mahmut",65,true,"Tarih")

    print(ogr1.toString())

}