package com.example.newsify

class NewsRepository(private val webservice: NewsWebservice = NewsWebservice()) {
    private var chachedNews = listOf<News>()
    suspend fun getNews() : NewsCategory {
        val newsResponceDetails= webservice.getNews()
        chachedNews = newsResponceDetails.articles
      return newsResponceDetails
    }
    fun getNewsDetails(name : String) : News?
    {
        return chachedNews.firstOrNull(){
            it.source.name== name
        }

    }
    companion object
    {
        @Volatile
        private var instance : NewsRepository? = null
        fun getInstace() = instance?: synchronized(this){
            instance ?: NewsRepository().also { instance = it }
        }
    }
}