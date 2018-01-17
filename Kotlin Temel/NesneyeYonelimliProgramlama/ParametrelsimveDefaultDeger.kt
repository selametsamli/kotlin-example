package NesneyeYonelimliProgramlama

class Dikdortgen (var en:Int=0,var boy:Int=0) {

    fun alanHesapla():Int{
        return en*boy
    }


}

fun main(args: Array<String>) {

    var d1:Dikdortgen= Dikdortgen(5,10)

    println(d1.alanHesapla())

    var d2:Dikdortgen= Dikdortgen(6,12)

    println(d2.alanHesapla())

    var d3=Dikdortgen(boy=18,en=8)

    println(d3.alanHesapla())
    var en=5
    var d4:Dikdortgen= Dikdortgen(en)
    println("d4 ün n değeri $en alan="+d4.alanHesapla())

}