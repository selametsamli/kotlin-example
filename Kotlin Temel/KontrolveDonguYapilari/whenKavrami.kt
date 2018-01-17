package KontrolveDonguYapilari

fun main(args: Array<String>) {


    print("Notunuzu Giriniz: ")
    var notDegeri : Int = readLine()!!.toInt()

    var sonuc=when(notDegeri){

        in 0..44 -> {
            println("1 aldın")
            1
        }in 45..54->{
            println("2 aldın")
            2
        }in 55..70->{
            println("3 aldın")
            3
        }in 71..85->{
            println("4 aldın")
            4
        }in 86..100->{
            println("5 aldın")
            5
        }else->{
            println("hatalı giriş")
            -1
        }

    }

    if(sonuc>0 && sonuc<6){
        println("Sonuc : " + sonuc)
    }else{
        println("Tekrar deneyin hatalı giriş yaptınız.")
    }

}