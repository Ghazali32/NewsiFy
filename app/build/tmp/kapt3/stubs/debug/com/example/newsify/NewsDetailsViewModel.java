package com.example.newsify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/newsify/NewsDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "newsState", "Landroidx/compose/runtime/MutableState;", "Lcom/example/newsify/News;", "getNewsState", "()Landroidx/compose/runtime/MutableState;", "setNewsState", "(Landroidx/compose/runtime/MutableState;)V", "repository", "Lcom/example/newsify/NewsRepository;", "app_debug"})
public final class NewsDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.newsify.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<com.example.newsify.News> newsState;
    
    public NewsDetailsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.newsify.News> getNewsState() {
        return null;
    }
    
    public final void setNewsState(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<com.example.newsify.News> p0) {
    }
}