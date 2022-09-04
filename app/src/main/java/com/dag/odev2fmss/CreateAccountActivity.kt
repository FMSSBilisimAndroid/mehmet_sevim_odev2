package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dag.odev2fmss.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var createAccountBinding: ActivityCreateAccountBinding
    private lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createAccountBinding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(createAccountBinding.root)
        createAccountBinding.apply {
            materialButtonCreateAccountBackButton.setOnClickListener{
                previusActivity()
            }

        }
    }
    /**
     * intent kullanılarak bir önceki activity'e geçiş yapıldı
     */
    fun previusActivity(){
        myIntent = Intent(this, LoginActivity::class.java)
        startActivity(myIntent)
    }
}