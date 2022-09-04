package com.dag.odev2fmss

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    private lateinit var myIntent: Intent
    private lateinit var username:String
    private lateinit var password:String

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
             * Giriş yapmayı sağlayan fonksiyon çalıştırıldı
             * kullanıcı adı veya şifre hatalıysa input textler hata gösterdi
             */
            materialbuttonLoginScreenLogin.setOnClickListener {
                username = textInputLoginscreenUsername.text.toString()
                password = textInputLoginscreenPassword.text.toString()
                if(login(username,password) == 0)
                {
                    toastMessage("Kullanıcı adı ve/veya şifre hatalı")
                    textInputLoginscreenUsername.setError("Hata")
                    textInputLoginscreenPassword.setError("Hata")
                }
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

    /**
     * @param username String kullanıcı adı
     * @param password String şifre
     * Girilen kullanıcı adı ve şifre SharedPrefence'dan kontrol ediliyor
     * bilgiler doğru ise ilgili toast message çalışıyor ve 1 dönüyor
     * Bilgiler yanlışsa 0 dönüyor
     */
    fun login(username:String,password:String):Int{
        val userInfo = this.getSharedPreferences("UserInfo",Context.MODE_PRIVATE);
        var user=userInfo.getString("UserName","")
        var pass=userInfo.getString("Password","")
        if(username == user && pass==password )
        {
            toastMessage("Giriş Başarılı")
            return 1
        }
        else{ return 0}
    }

    /**
     * @param message String
     * gelen mesajı ekranda gösteren fonksiyon
     */
    fun toastMessage(message:String)
    {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }


}