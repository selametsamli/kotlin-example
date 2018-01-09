package DosyaIslemleri

import java.io.FileReader

fun main(args: Array<String>) {
    var dosya: FileReader? =null

    try{
        dosya=FileReader("ilkDosya.txt")

        var okunanVeri:Int
        do{
            okunanVeri=dosya.read()
            print(okunanVeri.toChar())
        }while (okunanVeri!=-1)



    }catch (istisna:Exception){
        print(istisna.toString())
    }finally {
        dosya?.close()
    }


}