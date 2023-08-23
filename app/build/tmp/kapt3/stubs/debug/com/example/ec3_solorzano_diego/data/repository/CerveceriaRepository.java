package com.example.ec3_solorzano_diego.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/ec3_solorzano_diego/data/repository/CerveceriaRepository;", "", "cerveceriaDao", "Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDao;", "(Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDao;)V", "getCerveceriaDao", "()Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDao;", "addFavorite", "", "cerveceria", "Lcom/example/ec3_solorzano_diego/model/Cerveceria;", "(Lcom/example/ec3_solorzano_diego/model/Cerveceria;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCervecerias", "Lcom/example/ec3_solorzano_diego/model/ApiResponse;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "removeFavorite", "app_debug"})
public final class CerveceriaRepository {
    @org.jetbrains.annotations.Nullable()
    private final com.example.ec3_solorzano_diego.data.db.CerveceriaDao cerveceriaDao = null;
    
    public CerveceriaRepository() {
        super();
    }
    
    public CerveceriaRepository(@org.jetbrains.annotations.Nullable()
    com.example.ec3_solorzano_diego.data.db.CerveceriaDao cerveceriaDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ec3_solorzano_diego.data.db.CerveceriaDao getCerveceriaDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCervecerias(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ec3_solorzano_diego.model.ApiResponse<java.util.List<com.example.ec3_solorzano_diego.model.Cerveceria>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavorite(@org.jetbrains.annotations.NotNull()
    com.example.ec3_solorzano_diego.model.Cerveceria cerveceria, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeFavorite(@org.jetbrains.annotations.NotNull()
    com.example.ec3_solorzano_diego.model.Cerveceria cerveceria, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ec3_solorzano_diego.model.Cerveceria> getFavorites() {
        return null;
    }
}