package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dag.odev2fmss.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    private lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /**
         * binding kullanılarak LoginActivity içerisindekilere ulaşıldı
         */
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.apply {

            /**
             * * Yeni hesap Oluşturma Ekranına Giden fonkiyon Çalıştırıldı
             */
            materialButtonLoginScreenNewAcc.setOnClickListener {
                createNewAccount()
            }

            /**
             * * Bir önceki Activity'e yönlendiren fonkiyon Çalıştırıldı
             */
            materialButtonLoginScreenBackButton.setOnClickListener{
                previousActivity()
            }

            /**
             * Giriş yapmayı sağlayan fonksiyon çalıştırıldıdir
             */
            materialbuttonLoginScreenLogin.setOnClickListener {
                login()
            }

        }

    }

    /**
     * intent kullanılarak bir CreateAccountActiviy'e geçiş yapıldı
     */
    fun createNewAccount() {
        myIntent = Intent(this, CreateAccountActivity::class.java)
        startActivity(myIntent)
    }

    /**
     * intent kullanılarak bir önceki activity'e geçiş yapıldı
     */
    fun previousActivity(){
        myIntent = Intent(this, GetStartedActivity::class.java)
        startActivity(myIntent)
    }

    fun login(){

    }
}