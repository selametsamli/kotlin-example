package com.selametsamli.manzararecyclerview

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.tek_satir_manzara.view.*

/**
 * Created by selametsamli on 24.01.2018.
 */
class ManzaraAdaptor(tumManzaralar:ArrayList<Manzara>):RecyclerView.Adapter<ManzaraAdaptor.ManzaraViewHolder>() {

    var manzaralar =tumManzaralar


    override fun getItemCount(): Int {
        Log.e("RECYCLERVIEW","GET ITEM COUNT TETIKLENDI")
        return manzaralar.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ManzaraViewHolder {
        //xml den javaya dönüştüreceğimiz yer


        var inflater = LayoutInflater.from(parent?.context)
        var tekSatirManzara = inflater.inflate(R.layout.tek_satir_manzara,parent,false)
        return ManzaraViewHolder(tekSatirManzara)

        Log.e("RECYCLERVIEW","ON CREATE VİEW HOLDER TETIKLENDI")

    }



    override fun onBindViewHolder(holder: ManzaraViewHolder?, position: Int) {


        var oanOlusturulanManzara = manzaralar.get(position)
        holder?.setData(oanOlusturulanManzara,position)
       /*
        holder?.manzaraAciklama?.text = manzaralar.get(position).aciklama
        holder?.manzaraBaslik?.text = manzaralar.get(position).baslik
        holder?.manzaraResim?.setImageResource(manzaralar.get(position).resim)*/

        Log.e("RECYCLERVIEW","ON BIND VIEW HOLDER TETIKLENDI")

    }

    inner class ManzaraViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tekSatirManzara = itemView as CardView //CardView türüne dönüştürüyoruz.

        var manzaraBaslik = tekSatirManzara.tvBaslik
        var manzaraAciklama = tekSatirManzara.tvManzaraAciklama
        var manzaraResim = tekSatirManzara.imgManzara

        var btnKopyala = tekSatirManzara.imgKopyala
        var btnSil = tekSatirManzara.imgSil


        fun setData(oanOlusturulanManzara: Manzara, position: Int) {


                manzaraBaslik.text = oanOlusturulanManzara.baslik
                manzaraAciklama.text = oanOlusturulanManzara.aciklama
                manzaraResim.setImageResource(oanOlusturulanManzara.resim)


                btnKopyala.setOnClickListener {

                    manzaralar.add(position,oanOlusturulanManzara)
                    notifyItemRangeChanged(position,manzaralar.size)
                    notifyItemInserted(position)

                }
                btnSil.setOnClickListener {

                    manzaralar.removeAt(position)
                    notifyItemRangeChanged(position,manzaralar.size)
                    notifyItemRemoved(position)
                }

        }


    }




    }



