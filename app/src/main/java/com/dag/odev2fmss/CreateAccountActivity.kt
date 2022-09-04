package com.dag.odev2fmss

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityCreateAccountBinding


class CreateAccountActivity : AppCompatActivity() {
    private lateinit var createAccountBinding: ActivityCreateAccountBinding
    private lateinit var myIntent: Intent
    private lateinit var userName:String
    private lateinit var password:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createAccountBinding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(createAccountBinding.root)
        createAccountBinding.apply {
            /**
             * bir öceki activity'e geçiş için gerekli fonksiyon çağırılıyor
             */
            materialButtonCreateAccountBackButton.setOnClickListener{
                previusActivity()
            }
            /**
             * Giriş Bilgileri alınıyor ve kayıt için fonksiyon çağırılıyor
             * LoginActivity'e geri dönüş için uygun foksiyon çağırılıyor
             */
            materialbuttonCreateAccountSingUp.setOnClickListener {
                userName = textInputCreateAccountUsername.text.toString()
                password = textInputCreateAccountPassward.text.toString()
                createAccount(userName, password)
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

    /**
     * @param username String kullanıcı adı
     * @param password String şifre alanı
     * SharedPref kullanılarak bilgiler kayıt ediliyor
     */
    fun createAccount(username: String?, password: String?)
    {
        val userinfo = this.getSharedPreferences("UserInfo",Context.MODE_PRIVATE)
        val editor = userinfo.edit()
        editor.putString("UserName", username)
        editor.putString("Password", password)
        editor.commit()
        Toast.makeText(applicationContext, "Kayıt Başarılı", Toast.LENGTH_LONG).show()
    }
}