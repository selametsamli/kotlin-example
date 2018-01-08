package DegiskenKavramiveCesitleri

fun main(args: Array<String>) {

    var shortSayi : Short = 32767

    var intSayi : Int

    intSayi= shortSayi.toInt()


    println(intSayi)

    var intSayi2 : Int = 45000

    var shortSayi2: Short

    shortSayi2=intSayi2.toShort()

    println(shortSayi2)

    var noktaliSayi : Double = 50.555325

    var noktaliSayitoInt : Int

    noktaliSayitoInt=noktaliSayi.toInt()

    println("Noktalı Sayı: "+noktaliSayi+" İnt Sayı: "+noktaliSayitoInt)

    var sayi1 =53
    println(sayi1+1)

    println(sayi1.toString()+1)

}