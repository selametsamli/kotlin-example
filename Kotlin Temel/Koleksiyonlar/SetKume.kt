package Koleksiyonlar

//setof, mutablesetof

fun main(args: Array<String>) {

    var degistirlemeyenSet= setOf("selamet",1,3,true,"selamet")//aynı isme sahip 1 den fazla eleman eklenemez

    for (i in degistirlemeyenSet){
        println(i)
    }

    var degistirlebilenSet= mutableSetOf("selamet",1,2,3,"selamet")

    degistirlebilenSet.add(1453)
    degistirlebilenSet.add(3)
    degistirlebilenSet.add(1)
    degistirlebilenSet.add(3)
    degistirlebilenSet.add(9)

    println("size "+ degistirlebilenSet.size)
}