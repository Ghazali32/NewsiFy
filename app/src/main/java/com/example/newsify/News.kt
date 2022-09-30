package com.example.newsify



data class NewsCategory(val articles : List<News>)

data class News(
    val title: String,
    val url: String,
    val urlToImage: String,
    val content : String,
    val source: Source ,
    val description : String
)
data class Source(
    val id: Any,
    val name: String
)