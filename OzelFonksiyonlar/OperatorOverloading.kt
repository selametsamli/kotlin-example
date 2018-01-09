package OzelFonksiyonlar

class Baslik(var deger:String){




}

fun main(args: Array<String>) {

    var isim="Selamet"
    var soyisim=" Şamlı"

    println(isim+soyisim)

    var tamad2=isim.plus(soyisim)
    println(tamad2)

    val b1=Baslik("Başlık 1")
    val b2=Baslik("Başlık 2")

    val b3=b1.plus(b2)

    println(b3.deger)

    val b4=b1.plus(b2)

    println(b4.deger)

    var b5=b1+b2 // fun başına operatör yazarsak çalışır

}

operator fun Baslik.plus(b2:Baslik):Baslik{

    var geciciBaslik:Baslik=Baslik(this.deger +" "+b2.deger)

    return geciciBaslik


}