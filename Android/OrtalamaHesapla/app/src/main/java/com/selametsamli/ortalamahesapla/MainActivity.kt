package com.selametsamli.ortalamahesapla

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.selametsamli.ortalamahesapla.R.array.tumNotlar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.yeni_ders_layout.*
import kotlinx.android.synthetic.main.yeni_ders_layout.view.*

class MainActivity : AppCompatActivity() {

    private val DERSLER = arrayOf("Matematik","Türkçe","Fizik","Kimya","Tarih","Algoritma")
    private var tumDersBilgileri:ArrayList<Dersler> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,DERSLER)

        etDersAd.setAdapter(adapter)

        if (rootLayout.childCount==0){
            btnHesapla.visibility = View.INVISIBLE
        }else{
            btnHesapla.visibility = View.VISIBLE
        }

        btnDersEkle.setOnClickListener {

            if (!etDersAd.text.isNullOrEmpty()){
                var inflater = LayoutInflater.from(this)
                /* var inflater2 = layoutInflater
                 var inflater3 = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                 inflater3.inflate()*/
                var yeniDersView=inflater.inflate(R.layout.yeni_ders_layout,null)

                yeniDersView.etYeniDersAd.setAdapter(adapter)

                var dersAdi = etDersAd.text.toString()
                var dersKredi = spnDersKredi.selectedItem.toString()
                var dersHarf = spnDersNotu.selectedItem.toString()

                yeniDersView.etYeniDersAd.setText(dersAdi)
                yeniDersView.spnYeniDersKredi.setSelection(spinnerDegerinIndexiBul(spnDersKredi,dersKredi))
                yeniDersView.spnYeniDersNotu.setSelection(spinnerDegerinIndexiBul(spnDersNotu,dersHarf))


                yeniDersView.btnYeniDersSil.setOnClickListener {

                    rootLayout.removeView(yeniDersView)
                    if (rootLayout.childCount==0){
                        btnHesapla.visibility = View.INVISIBLE
                    }else{
                        btnHesapla.visibility = View.VISIBLE
                    }
                }

                rootLayout.addView(yeniDersView)

                btnHesapla.visibility = View.VISIBLE

                sifirla()


            }else{
                Toast.makeText(this,"Ders Adını Giriniz!!!",Toast.LENGTH_LONG).show()
            }
        }

    }

    fun ortalamaHesapla(view : View){

        var toplamNot = 0.0
        var toplamKredi = 0.0

    for (i in 0..rootLayout.childCount-1){


        var tekSatir = rootLayout.getChildAt(i)
        var geciciDers:Dersler= Dersler(tekSatir.etYeniDersAd.text.toString(),
                ((tekSatir.spnYeniDersKredi.selectedItemPosition)+1).toString(),
                tekSatir.spnYeniDersNotu.selectedItem.toString())

        tumDersBilgileri.add(geciciDers)
    }

        for (oAnkiDers in tumDersBilgileri){

            toplamNot+=harfiNotaCevir(oAnkiDers.dersHarfNotu) * oAnkiDers.dersKredi.toDouble()
            toplamKredi+=oAnkiDers.dersKredi.toDouble()

        }

        Toast.makeText(this,"ORTALAMA: "+(toplamNot/toplamKredi),Toast.LENGTH_LONG).show()
        tumDersBilgileri.clear()
    }

    fun harfiNotaCevir(gelenNotHarfDegeri:String):Double{

        var deger=0.0

        when(gelenNotHarfDegeri){

            "AA"-> deger = 4.0
            "BA"-> deger = 3.5
            "BB"-> deger = 3.0
            "CB"-> deger = 2.5
            "CC"-> deger = 2.0
            "DC"-> deger = 1.5
            "DD"-> deger = 1.0
            "FF"-> deger = 0.0
        }

        return deger
    }

    fun sifirla(){
        etDersAd.setText("")
        spnDersKredi.setSelection(0)
        spnDersNotu.setSelection(0)
    }

    fun spinnerDegerinIndexiBul(spinner:Spinner,aranacakDeger:String):Int{

        var index=0
        for (i in 0..spinner.count){
            if (spinner.getItemAtPosition(i).toString().equals(aranacakDeger)){
                index=i
                break
            }
        }
        return index
    }

}

data class Dersler(var dersAdi:String, var dersKredi:String, var dersHarfNotu:String){



}
