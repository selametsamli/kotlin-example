package AbstractveInterface

fun main(args: Array<String>) {

    JavaStaticKavrami.main(args)

    var test:JavaStaticKavrami=JavaStaticKavrami
    println(JavaStaticKavrami.sinifAdi)

    test.sinifAdi="Yeni sinif"

    println(JavaStaticKavrami.sinifAdi)

    var test2:JavaStaticKavrami=JavaStaticKavrami

    test2.sinifAdi="Yeni sınıf test2"
    println(test2.sinifAdi)

    println(test.sinifAdi)

}