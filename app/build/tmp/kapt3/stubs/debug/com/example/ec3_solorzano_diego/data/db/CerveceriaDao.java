package com.example.ec3_solorzano_diego.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDao;", "", "addFavorite", "", "cerveceria", "Lcom/example/ec3_solorzano_diego/model/Cerveceria;", "(Lcom/example/ec3_solorzano_diego/model/Cerveceria;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "", "removeFavorite", "app_debug"})
public abstract interface CerveceriaDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cerveceria")
    public abstract java.util.List<com.example.ec3_solorzano_diego.model.Cerveceria> getFavorites();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object addFavorite(@org.jetbrains.annotations.NotNull()
    com.example.ec3_solorzano_diego.model.Cerveceria cerveceria, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeFavorite(@org.jetbrains.annotations.NotNull()
    com.example.ec3_solorzano_diego.model.Cerveceria cerveceria, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}