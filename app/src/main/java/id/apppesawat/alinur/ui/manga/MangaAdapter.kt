package id.apppesawat.alinur.ui.manga

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import id.apppesawat.alinur.R
import id.apppesawat.alinur.data.model.Manga
import id.apppesawat.alinur.databinding.ItemMangaBinding
import id.apppesawat.alinur.ui.base.BaseAdapter

class MangaAdapter(val context: Context): BaseAdapter<Manga>(R.layout.item_manga) {
    override fun onBind(binding: ViewDataBinding?, data: Manga) {
        val mBinding = binding as ItemMangaBinding
        Glide.with(context).load(data.thumb).into(mBinding.itemThumb)
    }

    override fun onClick(binding: ViewDataBinding?, data: Manga) {
        val intent = Intent(context, MangaActivity::class.java)
        intent.putExtra(MangaActivity.OPEN_NEWS, data)
        context.startActivity(intent)
    }
}