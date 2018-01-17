package NesneyeYonelimliProgramlama

class Kare{

    var tekKenar:Int=0

    constructor(){
        this.tekKenar=0
    }

    constructor(kenar: Int){
        this.tekKenar=kenar
    }

    fun kareninAlaniniHesapla():Int{
        return tekKenar*tekKenar
    }


}

fun main(args: Array<String>) {

    var k1=Kare()
    println(k1.kareninAlaniniHesapla())

    var k2=Kare(5)
    println(k2.kareninAlaniniHesapla())

}

