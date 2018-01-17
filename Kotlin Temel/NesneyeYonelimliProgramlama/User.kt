package NesneyeYonelimliProgramlama

class User(var id: Int, var isim: String) {

    var adres:String=""

    init {
        if(id<0){
            id=1
        }
        println("id :$id isim: $isim")
    }

    constructor(id:Int,isim:String,adres:String):this(id,isim){
        this.adres=adres


    }

}


fun main(args: Array<String>) {

    var emre:User= User(100,"selamet")
    var hayri:User=User(101,"yunus")
    var ali:User= User(-5,"Ali","Ankara")

    println(ali.adres)
    hayri.adres

}