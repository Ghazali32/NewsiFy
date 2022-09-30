package com.example.newsify

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class NewsDetailsViewModel(savedStateHandle: SavedStateHandle ): ViewModel() {
    private val repository: NewsRepository = NewsRepository.getInstace()
    var newsState = mutableStateOf<News?>(null)
    init {
        val newsid = savedStateHandle.get<String>("news_details_id")?: ""
        newsState.value = repository.getNewsDetails(newsid)
    }
}