package Dizi_Range_Null_VeriAlma

fun main(args: Array<String>) {


    var sayilar : IntRange = 1..20
    var adanZye : CharRange ='a'..'z'

    var sayilarTersten : IntRange =20..1
    var harflerTersten : CharRange='z'..'a'

    var oneToTwenty: IntRange = 1.rangeTo(20)
    var onToTwentyReverse : IntProgression= 20.downTo(1)

    var beserBeserSayilar : IntProgression=0.rangeTo(100).step(5)
    var beserBeserSayilarReverse : IntProgression=100.rangeTo(5).step(5)

    var elemanVarMi : Boolean =10 in beserBeserSayilar

    println("11 range içinde mi : "+ elemanVarMi)
    println(beserBeserSayilar.first)
    println(beserBeserSayilar.last)
    println(beserBeserSayilar.step)

    var sayi = 0..10

}