package com.example.newsify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/newsify/NewsRepository;", "", "webservice", "Lcom/example/newsify/NewsWebservice;", "(Lcom/example/newsify/NewsWebservice;)V", "chachedNews", "", "Lcom/example/newsify/News;", "getNews", "Lcom/example/newsify/NewsCategory;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsDetails", "name", "", "Companion", "app_debug"})
public final class NewsRepository {
    private final com.example.newsify.NewsWebservice webservice = null;
    private java.util.List<com.example.newsify.News> chachedNews;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.newsify.NewsRepository.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.newsify.NewsRepository instance;
    
    public NewsRepository() {
        super();
    }
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.newsify.NewsWebservice webservice) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.newsify.NewsCategory> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.newsify.News getNewsDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/newsify/NewsRepository$Companion;", "", "()V", "instance", "Lcom/example/newsify/NewsRepository;", "getInstace", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.newsify.NewsRepository getInstace() {
            return null;
        }
    }
}