package id.apppesawat.alinur.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import id.apppesawat.alinur.R
import id.apppesawat.alinur.data.model.AuthUser
import id.apppesawat.alinur.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser?){
//        val intent = Intent( this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }
}