package KontrolveDonguYapilari

fun main(args: Array<String>) {

/*
    for(i in 1..10){
        println(i)
    }

    var i :Int =0

       while (i<=10){
           println(i)
           i++
    }
*/
    var toplam :Int=0
    for(i in 1..100){
        if ((i%2)==0){
            toplam+=i
        }
    }
    println(" for toplam değerimiz: $toplam")


    var i : Int =1
    var ciftSayiToplami: Int = 0
    while (i<=100){
        if((i%2)==0){
            ciftSayiToplami += i

        }
        i++
    }

    println("While çift Sayı toplamı: $ciftSayiToplami")


    //do while ve while farkı

    var e=1
    while (e<1){
        println("While Çalıştı e: "+e)
        e++
    }
    println("While Sonu")

    var f=1
    do{
        println("Do While çalıştı f: "+f)       // önce çalışır sonra kontrol edilir.
        f++
    }while (f<1)


}