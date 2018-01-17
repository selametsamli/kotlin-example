package Dizi_Range_Null_VeriAlma

fun main(args: Array<String>) {

    var isim : String? =null

    println(isim)
    println(isim?.length)
   // println(isim!!.length)

    var sayi : Int?
    sayi=5
    println(sayi)

    sayi=null

    println(sayi)
    println(sayi.toString().length)

}