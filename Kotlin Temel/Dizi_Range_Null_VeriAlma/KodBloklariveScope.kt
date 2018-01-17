package Dizi_Range_Null_VeriAlma

var sayi : Int =5 // main dışında tanımlanacaksa ilk değer atamak zorundayız

fun main(args: Array<String>) {


    run {

        var seviye1 : Int = 1
        {
            println(seviye1)

        }

        var seviye2 : Int=2
        {

            println(seviye1)
            println(seviye2)

            var seviye3 : Int=3 // sadece bu blok ve blok 3 için oluşturulan bloklarda kullanılır.
            run {

            }

        }

    }

}