package com.selametsamli.burcrehberi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*

/**
 * Created by selametsamli on 22.01.2018.
 */
class BurclarArrayAdapter(var gelenContext: Context, resource: Int, textViewResourceId: Int,
                          var burcAdlari: Array<String>, var burcTarihleri:Array<String>, var burcSembolleri:Array<Int>)
    : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, burcAdlari) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var tekSatirView = convertView
        var viewHolder : ViewHolder?= null

        if (tekSatirView ==null){//öğeler ilk defa oluşturuluyorsa
            var inflater = LayoutInflater.from(gelenContext)
            tekSatirView = inflater.inflate(R.layout.tek_satir,parent,false)

            viewHolder = ViewHolder(tekSatirView)
            tekSatirView.tag = viewHolder


        }else {
            viewHolder = tekSatirView.getTag() as ViewHolder
        }

        viewHolder.burcResim.setImageResource(burcSembolleri[position])
        viewHolder.burcAd.setText(burcAdlari[position])
        viewHolder.burcTarih.setText(burcTarihleri[position])



        return tekSatirView
    }

}
class ViewHolder(tekSatirView: View) {

    var burcResim: ImageView
    var burcAd: TextView
    var burcTarih: TextView

    init {
        this.burcResim = tekSatirView.imgBurcSembol
        this.burcAd = tekSatirView.tvBurcAdi
        this.burcTarih = tekSatirView.tvBurcTarihi
    }

}