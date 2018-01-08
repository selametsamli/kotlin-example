package NesneyeYonelimliProgramlama

class Daire(var yariCap:Int){


}

fun main(args: Array<String>) {
    var d1:Daire=Daire(5)

    println("d1 alanı: "+ d1.yariCap*d1.yariCap*Math.PI)


    var d2:Daire=Daire(7)
    var d3:Daire=Daire(5)
    var d4:Daire=Daire(9)
    var d5:Daire=Daire(2)

    println("d2 alanı: "+d2.yariCap*d2.yariCap*Math.PI)

    println(daireAlaniniHesapla(d1))
    println(daireAlaniniHesapla(d2))


    var daireler:Array<Daire> = Array<Daire>(5){Daire(0)}

    daireler[0]=d1
    daireler[1]=d2
    daireler[2]=d3
    daireler[3]=d4
    daireler[4]=d5

    daireDizisiniGoste(daireler)

}

fun daireAlaniniHesapla(d:Daire){

     println("Dairenin Alanı: "+d.yariCap*d.yariCap*Math.PI)

}

fun daireDizisiniGoste(daireDizi:Array<Daire>){

    for (daire in daireDizi){

        daireAlaniniHesapla(daire)

    }


}