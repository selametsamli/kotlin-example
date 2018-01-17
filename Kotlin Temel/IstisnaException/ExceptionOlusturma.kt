package IstisnaException

class Person{

    var yas:Int=0
    get()=field
    set(value){
        if(value<0){
            val istisna=IllegalArgumentException("personel yaşı negatif olamaz")
            throw istisna
        }else{
            field= value
        }
    }

}

fun main(args: Array<String>) {

    var p1=Person()
    println(p1.yas)
   try {
       p1.yas=-9
       println(p1.yas)
   }catch (istisna:Exception){
       println("hata 1 : "+istisna.message)
       println("hata 1 : "+istisna.toString())

   }finally {
       println("Program bitti ")
   }


}