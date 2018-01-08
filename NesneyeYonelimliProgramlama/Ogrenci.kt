package NesneyeYonelimliProgramlama

class Ogrenci (isim:String, yas:Int) {

    var gelenIsim:String
    var gelenYas:Int

    init {
        this.gelenIsim=isim
        this.gelenYas=yas

        println("init bloğu çalıştı")
    }


    fun bilgileriGoster(){
        println("isim: $gelenIsim Yaş:$gelenYas")
    }

}

fun main(args: Array<String>) {

    var ogr1:Ogrenci= Ogrenci("Selamet",29)
    ogr1.bilgileriGoster()
}