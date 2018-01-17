package FonksiyonlarMethodlar

fun main(args: Array<String>) {

    var toplam= topla(5,2)
    println("Main funkdaki toplam değeri "+toplam)

    println(selamVer("Selamet"))

    var deger=faktoriyel(5)
    println(deger)

}

fun topla(sayi1:Int,sayi2:Int) : Int {

    println("Topla fonksiyondaki Toplam: "+ (sayi1+sayi2))

    return sayi1+sayi2
}
fun  selamVer(isim:String):String{


    return "Merhaba "+isim
}

fun faktoriyel(sayi:Int):Int{

    if (sayi==0){
        return 1
    }

    return sayi*faktoriyel(sayi-1)
}