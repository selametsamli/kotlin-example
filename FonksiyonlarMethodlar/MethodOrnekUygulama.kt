package FonksiyonlarMethodlar

fun main(args: Array<String>) {
    while (true){

        menuGoster()
        var secim= readLine()!!.toInt()
        if (secim==5)break
        else if(secim==1||secim==2||secim==3||secim==4){


            print("Sayi 1 Değerini Giriniz: ")
            var sayi1= readLine()!!.toInt()

            print("Sayi 2 Değerini Giriniz: ")
            var sayi2= readLine()!!.toInt()


            when(secim){
                1-> {
                    var toplam= toplamaIslemi(sayi1,sayi2)
                    println("Toplam Değeri: "+toplam)
                }
                2-> {
                    var fark= cikarmaIslemi(sayi1,sayi2)
                    println("Fark Değeri: "+fark)
                }
                3-> {
                    var carpim= carpmaIslemi(sayi1,sayi2)
                    println("Çarpım Değeri: "+carpim)
                }
                4-> {
                    var bolum= bolmeIslemi(sayi1,sayi2)
                    println("Bölüm Değeri: "+bolum)}


            }



            }
        else{
            println("\n HATALI GİRİŞ YAPTINIZ\n")
        }
    }




    }





fun menuGoster(){

    println("MENU")
    println("1-Toplama İşlemi")
    println("2-Çıkarma İşlemi")
    println("3-Çarpma İşlemi")
    println("4-Bölme İşlemi")
    println("5-Çıkış")
    print("Lütfen Yapmak İstediğiniz İşlemi Giriniz:")


}

fun toplamaIslemi(sayi1 : Int,sayi2:Int):Int{

    return sayi1+sayi2
}

fun cikarmaIslemi(sayi1 : Int,sayi2:Int):Int{

    return sayi1-sayi2
}

fun carpmaIslemi(sayi1 : Int,sayi2:Int):Int{

    return sayi1*sayi2
}

fun bolmeIslemi(sayi1 : Int,sayi2:Int):Int{

    return sayi1/sayi2
}