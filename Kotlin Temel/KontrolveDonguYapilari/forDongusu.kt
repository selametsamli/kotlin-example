package KontrolveDonguYapilari

import Dizi_Range_Null_VeriAlma.sayi

fun main(args: Array<String>) {

   /* for (i in 1..10){
        println(i)
    }
*/
  /*  var isim="Selamet Şamlı"

    for(h in isim){
        if(!h.equals(isim.last())){
            println(h+",")
        }else{
            println(h)
        }
    }*/

  /*  var sayilar = arrayOf(5,10,15,20)
    var toplam =0
    for(s in sayilar){
        println(s)
        toplam += s
    }
    println("Toplam Değeri: "+toplam)

    */

    for (i in 1..3){
        for(j in 1..3){
            println("$i * $j = "+i*j)
        }
    }


}