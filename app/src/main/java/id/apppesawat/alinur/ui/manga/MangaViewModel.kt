package id.apppesawat.alinur.ui.manga

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.apppesawat.alinur.data.model.ActionState
import id.apppesawat.alinur.data.model.Manga
import id.apppesawat.alinur.data.repository.MangaRepository
import kotlinx.coroutines.launch

class MangaViewModel : ViewModel() {
    private val repo: MangaRepository by lazy { MangaRepository() }

    val loading = MutableLiveData(false)
    val actionState = MutableLiveData<ActionState<*>>()

    val listResp = MutableLiveData<List<Manga>>()


    fun listManga(){
        viewModelScope.launch {
            loading.value = true
            val resp = repo.listManga()
            actionState.value = resp
            listResp.value = resp.data
            loading.value = false
        }
    }
}