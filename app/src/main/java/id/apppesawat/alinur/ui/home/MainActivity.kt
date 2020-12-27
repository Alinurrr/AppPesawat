package id.apppesawat.alinur.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import id.apppesawat.alinur.R
import id.apppesawat.alinur.databinding.ActivityMainBinding
import id.apppesawat.alinur.ui.auth.AppPesawatAuth
import id.apppesawat.alinur.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init()
    }

    private fun init() {
        binding.bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home ->navigate(R.id.homeFragment2)
                R.id.ic_manga ->navigate(R.id.mangaFragment)
                R.id.ic_favorite ->navigate(R.id.favoriteFragment2)
                R.id.ic_profile ->navigate(R.id.profileFragment2)
                else ->false

            }
        }
    }

    private fun navigate(id: Int): Boolean {
        findNavController(R.id.navHost).navigate(id)
        return true
    }
}