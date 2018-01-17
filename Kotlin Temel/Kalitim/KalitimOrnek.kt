package Kalitim

open class Person(isim:String, yas:Int, isMan:Boolean){

    open var isim:String=""
    open var yas:Int=0
    open var isMan:Boolean=true


    init {

        println("Person sınıfının initi tetiklendi")
        this.isim=isim
        this.yas=yas
        this.isMan=isMan

    }

    override fun toString(): String {
        var cinsiyet=if (isMan)"erkek" else "kadın"

        return "İsim $isim Yaş: $yas Cinsiyet: $cinsiyet"
    }

}

class Ogretmen(isim:String, override var yas:Int, isMan:Boolean, brans:String):Person(isim, yas, isMan){

    var brans:String

    init {
        println("Öğretmen sınıfının initi tetiklendi")
        if (yas<0){
            yas=999
        }


        this.brans=brans
    }

    override fun toString(): String {
        return super.toString()+" Branş: $brans"
    }

}


fun main(args: Array<String>) {

    var p1=Person("Selamet",21,true)
    println(p1)

    var ogr=Ogretmen("Hayriye",45,false,"Fizik")

    println(ogr)
    var ogr1=Ogretmen("Hayri",-1,false,"Matematik")

    println(ogr1.yas)


}