package com.selametsamli.burcrehberi

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.graphics.Palette
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        var position =intent.extras.get("tiklanilanOgePosition") as Int
        var tumBurcBilgileri = intent.extras.get("tumBurcBilgileri") as ArrayList<Burc>

        tvBurcOzellikleri.setText(tumBurcBilgileri.get(position).burcGenelOzellikleri)
        header.setImageResource(tumBurcBilgileri.get(position).burcBuyukResim)

        setSupportActionBar(anim_toolbar)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
        collapsing_toolbar.title = tumBurcBilgileri.get(position).burcAdi

        var bitmap = BitmapFactory.decodeResource(resources,tumBurcBilgileri.get(position).burcBuyukResim)

        Palette.from(bitmap).generate(object : Palette.PaletteAsyncListener{
            override fun onGenerated(palette: Palette?) {

                var mutedColor = palette?.getVibrantColor(R.attr.colorAccent)
                collapsing_toolbar.setContentScrimColor(mutedColor!!)

                window.statusBarColor = mutedColor
            }

        })


        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    }

