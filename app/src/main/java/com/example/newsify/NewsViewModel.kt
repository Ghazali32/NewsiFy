package com.example.newsify

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(private val repository: NewsRepository = NewsRepository.getInstace()) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO){
            val news = getNews()
           NewsState.value = news
        }
    }

    val NewsState : MutableState<List<News>> =  mutableStateOf(emptyList())

   suspend fun getNews() : List<News> {
       return repository.getNews().articles
    }



}