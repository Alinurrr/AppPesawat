package id.apppesawat.alinur.ui.manga

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import id.apppesawat.alinur.R
import id.apppesawat.alinur.databinding.FragmentMangaBinding
import id.apppesawat.alinur.ui.home.MainActivity

class MangaFragment : Fragment() {
    private val parent: MainActivity by lazy { activity as MainActivity  }
    private lateinit var binding: FragmentMangaBinding
    private val viewModel: MangaViewModel by lazy { MangaViewModel() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMangaBinding.inflate(inflater, container, false).apply {
            viewModel = this@MangaFragment.viewModel
            lifecycleOwner = this@MangaFragment
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
        observe()
    }


    private fun init() {
        binding.recyclerView.adapter = MangaAdapter(parent)
        viewModel.listManga()
    }

    private fun observe() {
        viewModel.loading.observe(viewLifecycleOwner){

        }

        viewModel.actionState.observe(viewLifecycleOwner){
            if(it.isConsumed){
                Log.i("ActionState", "isConsumed")
            }else if (!it.isSuccess){
                Toast.makeText(parent, it.message, Toast.LENGTH_SHORT).show()
            }
        }
    }


}