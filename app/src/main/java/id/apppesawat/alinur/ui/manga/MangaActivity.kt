package id.apppesawat.alinur.ui.manga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.apppesawat.alinur.R

class MangaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manga)
    }
    companion object {
        const val OPEN_NEWS = "open_news"
    }

}