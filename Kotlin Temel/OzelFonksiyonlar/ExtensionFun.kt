package OzelFonksiyonlar

fun main(args: Array<String>) {

    println("Normal Faktöriyel 5!: "+ faktoriyelBul(5))
    println("Extension Faktöriyel 5!: "+ 6.faktoriyelBullExt())

    var yazi="Selamet          Şamlı \t  Hayri"

    println(yazi)

    println("Düzenlenmiş hali: "+yazi.bosluklariDuzenle())


}

fun faktoriyelBul(sayi:Int):Int{

    var sonuc=1
    for (i in 1..sayi) {
        sonuc *= i

    }
    return sonuc


}

fun Int.faktoriyelBullExt():Int{

    var sonuc=1
    for (i in 1..this) {
        sonuc *= i

    }
    return sonuc
}

fun String.bosluklariDuzenle():String{

    var regex=Regex("\\s+")

    return  regex.replace(this," ")//birden fazla boşluğu tek boşlukla yer değiştir

}