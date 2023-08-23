package com.example.ec3_solorzano_diego.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/ec3_solorzano_diego/fragments/FavoriteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_favorites", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/ec3_solorzano_diego/model/Cerveceria;", "favorites", "Landroidx/lifecycle/LiveData;", "getFavorites", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/ec3_solorzano_diego/data/repository/CerveceriaRepository;", "", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.ec3_solorzano_diego.data.repository.CerveceriaRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ec3_solorzano_diego.model.Cerveceria>> _favorites = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.ec3_solorzano_diego.model.Cerveceria>> favorites = null;
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.ec3_solorzano_diego.model.Cerveceria>> getFavorites() {
        return null;
    }
    
    public final void getFavorites() {
    }
}