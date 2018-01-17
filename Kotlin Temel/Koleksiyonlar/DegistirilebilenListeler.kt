package Koleksiyonlar

fun main(args: Array<String>) {
    //mutablelistof arraylistof

    var degisebilenListe=ArrayList<Int>(50)//initial capacity zorunlu değil
    var arrayListOfListesi= arrayListOf("selamet",3,null,true)

    //ekleme
    arrayListOfListesi.add(53)
    arrayListOfListesi.add(5.3)
    arrayListOfListesi.add("53")

    for (i in arrayListOfListesi){
        println(i)
    }

    //güncelleme

    arrayListOfListesi.set(0,"newSelamet")
    println(arrayListOfListesi[0])
    println("------------------")

    arrayListOfListesi.remove("newSelamet")

    for (i in arrayListOfListesi){
        println(i)
    }
    arrayListOfListesi.removeAt(0)

    println("-----------------")

    for (i in arrayListOfListesi){
        println(i)
    }

    println("Size: "+arrayListOfListesi.size)


}