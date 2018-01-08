package AbstractveInterface

interface Hayvan {

    fun avlan()//interfacelerde methodlarımız abstracttır ve publictir

    fun interfaceTest(){

        println("Interface methodu")

    }

}

abstract class Kedigiller :Hayvan{

    abstract fun takipEt()

}

open class Kedi:Kedigiller(){
    override fun avlan() {
        println("")
    }

    override fun takipEt() {
        println("Kedi sınıfı takip et çalıştı")
    }

}

class Kaplan:Kedi(){

    override fun interfaceTest() {
        super.interfaceTest()
    }

    override fun takipEt() {
        println("Kaplan sınıfı takip et çalıştı")
    }

}