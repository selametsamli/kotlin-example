package Koleksiyonlar

//hashmapof , mutablemapof

fun main(args: Array<String>) {

    var degistirilebilirMap= hashMapOf<String,String>("1" to "Selamet","2" to "Hayri")

    degistirilebilirMap.set("3","Bozkurt")
    degistirilebilirMap.put("4","Hav Hav")

    println(degistirilebilirMap.get("1"))
    println(degistirilebilirMap["3"])

    degistirilebilirMap.put("5","Melek")
    degistirilebilirMap.set("1","newSelamet") //set ile düzenleme yapılabilir.

    for (i in degistirilebilirMap){
        println(i.value)
    }
    for (i in degistirilebilirMap){
        println(i.key)
    }

    degistirilebilirMap.remove("1")

    for (i in degistirilebilirMap){
        println(i)
    }


}