package com.selametsamli.ortalamahesapla

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import com.selametsamli.ortalamahesapla.R.id.imgBalon
import kotlinx.android.synthetic.main.activity_splash.*

class activity_splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var asagidanGelenButton = AnimationUtils.loadAnimation(this,R.anim.asagidangelenbutton)
        btnOrtAnim.animation = asagidanGelenButton

        var yukaridanGelenBalon = AnimationUtils.loadAnimation(this,R.anim.yukaridangelenbalon)
        imgBalon.animation = yukaridanGelenBalon

        var asagiyaGeriDoneneButton = AnimationUtils.loadAnimation(this,R.anim.asagigidenbutton)

        var yukariGeriDonenBalon = AnimationUtils.loadAnimation(this,R.anim.yukarigidenbalon)

        btnOrtAnim.setOnClickListener {

            btnOrtAnim.startAnimation(asagiyaGeriDoneneButton)
            imgBalon.startAnimation(yukariGeriDonenBalon)

            object :CountDownTimer(1000,1000){
                override fun onFinish() {
                    var intent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                }

                override fun onTick(millisUntilFinished: Long) {

                }

            }.start()
        }
    }
}
