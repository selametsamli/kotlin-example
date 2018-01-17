package Dizi_Range_Null_VeriAlma

fun main(args: Array<String>) {

    println("İsminizi giriniz: ")

    var isim : String? = readLine()



    println("Soyadınızı giriniz: ")

    var soyisim : String = readLine() !!

    //println(soyisim.length) // ""!=null

    println("Yaşınızı Girin: ")

    var yas : Int = readLine()!!.toInt()

    println("ad :$isim soyad:$soyisim yaş:$yas")

}