package com.example.newsify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/newsify/NewsWebservice;", "", "()V", "api", "Lcom/example/newsify/NewsWebservice$NewsApi;", "getNews", "Lcom/example/newsify/NewsCategory;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NewsApi", "app_debug"})
public final class NewsWebservice {
    private com.example.newsify.NewsWebservice.NewsApi api;
    
    public NewsWebservice() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.newsify.NewsCategory> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/newsify/NewsWebservice$NewsApi;", "", "getNews", "Lcom/example/newsify/NewsCategory;", "countryCode", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface NewsApi {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "v2/top-headlines")
        public abstract java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "country")
        java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "apiKey")
        java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.newsify.NewsCategory> continuation);
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
        }
    }
}