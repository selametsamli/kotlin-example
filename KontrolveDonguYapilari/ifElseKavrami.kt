package KontrolveDonguYapilari

fun main(args: Array<String>) {
/*    var yas : Int =16

    if (yas>18){
        println("Yaşınız 18den büyük")
        println("Ehliyet Alabilirsiniz")

    }else if (yas>15 && yas<18){
        println("Az daha sabret")
    }else{
        println("Daha Çok küçüksün")
    }*/

    print("Notunuzu Giriniz: ")
    var notDegeri : Int= readLine()!!.toInt()
    var karneNotu : Int =0

    var sonuc  = if (notDegeri in 0..44){

        println("1 Aldın")
        karneNotu=1
        "A"
    }else if(notDegeri in 45..54){
        println("2 Aldın")
        karneNotu=2
        "B"
    }else if(notDegeri in 55..69){
        println("3 aldın")
        karneNotu=3
        "C"
    }else if(notDegeri in 70..84){
        println("4 Aldın")
        karneNotu=4
        "D"
    }else if(notDegeri in 85..100){
        println("Tebrikler 5 Aldın")
        karneNotu=5
        "E"
    }else{
        println("Hatalı giriş Yaptınız")
        "F"
    }
    println("Karneye yansıyacak notun : "+karneNotu)
    println("Sonuc: "+ sonuc)

}