package com.selametsamli.burcrehberi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var burclar= arrayOf("Koç","Boğa","Balık","İkizler","Aslan","Yengeç","Başak","Terazi","Yay","Oğlak","Kova","Akrep")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var burclarAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,burclar)
          var burclarAdapter = ArrayAdapter<String>(this,R.layout.tek_satir,R.id.tvBurcAdi,burclar)
        listBurclar.adapter=burclarAdapter


/*        listBurclar.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                var gecici = view as TextView

                Toast.makeText(this@MainActivity,"Tıklanıldı: "+gecici.text.toString()+" Pos:"+position,Toast.LENGTH_LONG).show()
            }
        })*/


        listBurclar.setOnItemClickListener { parent, view, position, id ->

            var gecici = view as TextView

            Toast.makeText(this@MainActivity,"Tıklanıldı: "+gecici.text.toString()+
                    " Pos:"+position,Toast.LENGTH_LONG).show()

        }


        }
}
