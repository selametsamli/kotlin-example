package Koleksiyonlar

fun main(args: Array<String>) {

    //mapof ile değiştirilemeyen map

    var map= mapOf<Int, String>(1 to "Selamet",2 to "Hayri", 3 to "Ali")

    println("keyi 2 olan değer: "+map.get(2))

    for (str in map){
        println(str.key)
        println(str.value)
    }

    var aranacakIfade= readLine()!!
    if (map.containsValue(aranacakIfade)){
        println("$aranacakIfade map de var ")
    }else{
        println("$aranacakIfade map de yok")
    }
}