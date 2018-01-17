package MathStringArray


fun main(args: Array<String>) {

    var sayilarDizisi= Array<Int>(3){0}

    var kelimeDizisi = Array<String>(10){""}

    sayilarDizisi=Array<Int>(13){0}

    for(i in 0..sayilarDizisi.size-1){
        sayilarDizisi[i]=i+1

        println(sayilarDizisi[i])
    }


    var degiskenlerim = arrayOf("emre",1,true)

    for (i in degiskenlerim){
        println(i)
    }



}