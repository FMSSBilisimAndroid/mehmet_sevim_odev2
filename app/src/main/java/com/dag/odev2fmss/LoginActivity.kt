package com.dag.odev2fmss

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    private lateinit var myIntent: Intent
    private lateinit var Username:String
    private lateinit var Password:String

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
                Username = textInputLoginscreenUsername.text.toString()
                Password = textInputLoginscreenPassword.text.toString()
                login(Username,Password)
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

    fun login(username:String,password:String){
        val userInfo = this.getSharedPreferences("UserInfo",Context.MODE_PRIVATE);
        var user=userInfo.getString("UserName","")
        var pass=userInfo.getString("Password","")
        if(username == user && pass==password )
        {
            Toast.makeText(applicationContext, "Giriş Başarılı", Toast.LENGTH_LONG).show()
        }
        else
        {

        }


    }


}