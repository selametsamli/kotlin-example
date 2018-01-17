package MathStringArray

import java.util.*

fun main(args: Array<String>) {

    var dizi1= arrayOf(1,2,3,4,5)
    var dizi2=Array<Int>(5){0}

    System.arraycopy(dizi1,0,dizi2,0,dizi1.size)


    for (sayi in dizi2){

        println(dizi2[sayi])

    }

    Arrays.sort(dizi2)
}