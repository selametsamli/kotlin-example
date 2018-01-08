package Koleksiyonlar

//list

//mutable immutable

// immutable : listOf() veya listOfnotNull()

fun main(args: Array<String>) {

    var listOfListesi= listOf(2,3,"Selamet",true,null,5.4)

    for(oankiEleman in listOfListesi){
        println(oankiEleman)
    }
    println(listOfListesi.get(2))
    println(listOfListesi[2])
   // listOfListesi[3]="Hayri" hata verir set işlevi

    var s1=listOfListesi.get(0) as Int
    var s2=listOfListesi.get(1) as Int

    println(s1+s2)

    println(listOfListesi.size)

    var listOfNotNullListesi= listOfNotNull(2,3,"Selamet",true,null,5.4)

    println(listOfNotNullListesi.size)

}