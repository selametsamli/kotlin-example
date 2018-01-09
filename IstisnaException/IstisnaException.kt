package IstisnaException

fun main(args: Array<String>) {

    var dizi=Array<Int>(3){0}

    dizi[0]=0
    dizi[1]=1
    dizi[2]=2


    istisna1(dizi)

println("Main metotu sonlandı")

}

fun istisna2(dizi: Array<Int>) {
    println("istisna 2 başladı")
   try {
       for (i in 0..3 ){
           println(dizi[i])
       }
   }catch (hata:Exception){
       println("hata : ${hata.toString()}")
   }



    println("istisna 2 bitti")
}

fun istisna1(dizi: Array<Int>) {

    println("istisna 1 başladı")

    istisna2(dizi)

    println("istisna 1 bitti")
}
