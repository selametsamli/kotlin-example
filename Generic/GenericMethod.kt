package Generic

abstract class GeometrikSekil{

    abstract fun alanHesapla():Int

}

class Kare(var kenarUzunlugu:Int): GeometrikSekil() {
    override fun alanHesapla(): Int {
        return kenarUzunlugu*kenarUzunlugu
    }

}

class Dikdortken(var en:Int,var boy:Int):GeometrikSekil(){
    override fun alanHesapla(): Int {
        return en*boy
    }

}

fun main(args: Array<String>) {

    var k1=Kare(6)
    var k2=Kare(9)

    var buyukKare=alanKarsilastir(k1,k2)

    println("Büyük karenin alanı: ${buyukKare.alanHesapla()}")

    var d1=Dikdortken(6,9)
    var d2=Dikdortken(3,5)
    var buyukDikdortgen= alanKarsilastir(d1,d2)
    println("Büyük dikdörtgenin alanı: ${buyukDikdortgen.alanHesapla()}")

    var gs1:GeometrikSekil=Kare(5)
    var gs2:GeometrikSekil=Kare(14)

    var buyukGS= alanKarsilastir(gs1,gs2)
    println("Büyük olan şekil : ${buyukGS.alanHesapla()}")

    var s1=Dikdortken(3,5)
    var s2=Dikdortken(7,9)
    println("Büyük alan "+ generikAlanKarsilastir(s1,s2).alanHesapla())

}

fun alanKarsilastir(k1:Kare,k2:Kare):Kare{
    if (k1.alanHesapla()<k2.alanHesapla())return k2
    else return k2
}

fun alanKarsilastir(d1:Dikdortken,d2:Dikdortken):Dikdortken{
    if (d1.alanHesapla()<d2.alanHesapla())return d2
    else return d1
}

fun alanKarsilastir(gs1:GeometrikSekil,gs2:GeometrikSekil):GeometrikSekil{
    if (gs1.alanHesapla()<gs2.alanHesapla())return gs2
    else return gs1

}

fun <Genel:GeometrikSekil>generikAlanKarsilastir(sekil1:Genel,sekil2:Genel):Genel{

    if (sekil1.alanHesapla()<sekil2 .alanHesapla())return sekil2
    else return sekil1

}