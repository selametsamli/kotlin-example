package com.selametsamli.burcrehberi

import java.io.Serializable

/**
 * Created by selametsamli on 23.01.2018.
 */
data class Burc(var burcAdi:String,var burcTarihi:String, var burcSembol:Int, var burcBuyukResim:Int,var burcGenelOzellikleri:String):Serializable{}