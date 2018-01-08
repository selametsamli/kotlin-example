package DataClassGetterSetter

class KitapKotlin{

    var id1:Int
    get() = field
    set(value){
        if (value<0){field=1
        }else{
            field=value
        }
    }
    var isim1:String

    constructor(id1:Int,isim1:String,kapakRenk:KapakRenk){
        this.id1=id1
        this.isim1=isim1
        this.kapakRenk=kapakRenk
    }

    var kapakRenk:KapakRenk

}
enum class KapakRenk{

    KIRMIZI,
    MAVI,
    YESIL

}



fun main(args: Array<String>) {
    var k1:Kitap= Kitap(-9,"Hayriler")

    println(k1.getId())
    k1.setId(-53)
    println(k1.getId())

    var k2:KitapKotlin= KitapKotlin(-5,"Vadideki Zambak",KapakRenk.KIRMIZI)

    println(k2.id1)
    k2.id1=5
    println(k2.kapakRenk)
    print(k2.id1)
}