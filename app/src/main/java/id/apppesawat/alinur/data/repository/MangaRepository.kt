package id.apppesawat.alinur.data.repository

import id.apppesawat.alinur.data.model.ActionState
import id.apppesawat.alinur.data.model.Manga
import id.apppesawat.alinur.data.remote.MangaService
import id.apppesawat.alinur.data.remote.RetrofitApi
import retrofit2.await
import java.lang.Exception

class MangaRepository {
    private val mangaService: MangaService by lazy { RetrofitApi.mangaService() }

    suspend fun listManga() : ActionState<List<Manga>>{
        return try {
            val list = mangaService.listManga().await()
            ActionState(list.manga_list)
        }catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }

}