package com.example.footballkl.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.footballkl.Interface.PLMain
import com.example.footballkl.PL.PLModel.MainPLModel
import com.example.footballkl.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivityViewModel : ViewModel() {

    lateinit var recyclerListLiveData : MutableLiveData<MainPLModel>

    init {
        recyclerListLiveData = MutableLiveData()
    }

    fun getRecyclerListObserver(): MutableLiveData<MainPLModel> {
        return recyclerListLiveData
    }

    fun makeapiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            val plDataCall = RetrofitClient.getRetrofit()?.create(PLMain::class.java)
            val callPLMain = plDataCall?.mainPLCall

            callPLMain?.enqueue(object : Callback<MainPLModel?> {
                override fun onResponse(
                    call: Call<MainPLModel?>,
                    response: Response<MainPLModel?>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<MainPLModel?>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })

        }
    }

}