package DosyaIslemleri

import java.io.FileWriter

fun main(args: Array<String>) {

    //Dosya oluşturma
    var dosya=FileWriter("ilkDosya.txt",false)

    println("Adınızı Girin: ")

    var isim= readLine()!!

    dosya.write(isim+"\n")
    dosya.write("yaş 29")

    println("Veri Dosyaya yazıldı")

    dosya.close()


}