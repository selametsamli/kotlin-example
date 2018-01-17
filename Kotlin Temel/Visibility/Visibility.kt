package Visibility

class TestClass(){

    fun testing(){
        var referans:Ulus= Ulus()
        referans.c
        referans.d
        //referans.a
        //referans.b
    }

}


open class Ulus{

    private var a=1
    protected var b=2
    internal var c=3
    public var d=4


    open fun test(){
        println(a)
        println(b)
        println(c)
        println(d)
    }


}

class Turk:Ulus(){

    override fun test(){
       // println(a) private olduğu için hata verdi
        println(b)
        println(c)
        println(d)

    }

}

fun main(args: Array<String>) {



}