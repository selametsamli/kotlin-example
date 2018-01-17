package KontrolveDonguYapilari

fun main(args: Array<String>) {

    for (i in 1..10){
        println(i)
        if(i==7)
            break
    }

    println("-------------------------------------")

    for (harf in "selamet96@gmail.com"){

        if (harf=='@'){
            break
        }
        print(harf)
    }

    println("\n--------------------------------------")

    for (harf in "selamet96@gmail.com"){

        if (harf=='@')
            continue
        print(harf)

        var i = 1..5
    }
}