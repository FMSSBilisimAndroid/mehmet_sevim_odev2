package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dag.odev2fmss.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {
    private lateinit var getStartedBinding: ActivityGetStartedBinding
    private lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * binding kullanılarak GetStartedActivity içerisindeki Join butonuna ulaşıldı
         */
        getStartedBinding = ActivityGetStartedBinding.inflate(layoutInflater)
        setContentView(getStartedBinding.root)
        /**
         * bir sonraki sayfaya geçmeyi sağlayan fonksiyon çalıştırıldı
         */
        getStartedBinding.apply {
            materialbuttonGetStartedJoin.setOnClickListener {
                nextActivity()
            }
        }

    }

    /**
     * intent kullanılarak bir loginActiviy'e geçiş yapıldı
     *
     */
    fun nextActivity() {
        myIntent = Intent(this, LoginActivity::class.java)
        startActivity(myIntent)
    }


}



