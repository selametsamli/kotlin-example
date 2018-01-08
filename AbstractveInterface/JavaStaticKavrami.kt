package AbstractveInterface

object JavaStaticKavrami {

    var sinifAdi="JavaStaticKavrami"


    @JvmStatic
    fun main(args: Array<String>) {

        val og1 = OgrenciJava(1, "Selamet")
        og1.bilgileriYazdir()
        val og2 = OgrenciJava(2, "Hayri")
        og2.bilgileriYazdir()
        val og3 = OgrenciJava(3, "Fikret")



        og3.bilgileriYazdir()

    }
}

internal class OgrenciJava(private val id: Int, private val isim: String) {


    init {
        toplamOgrenciSayisi++

    }

    fun bilgileriYazdir() {

        println("No: $id İsim: $isim Toplam öğrenci sayısı:$toplamOgrenciSayisi")

    }

    companion object {
         var toplamOgrenciSayisi = 0
    }


}
