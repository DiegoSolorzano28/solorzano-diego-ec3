package com.example.ec3_solorzano_diego.data.db

import androidx.room.*
import com.example.ec3_solorzano_diego.model.Cerveceria

@Dao
interface CerveceriaDao {
    @Query("SELECT * FROM cerveceria")
    fun getFavorites(): List<Cerveceria>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addFavorite(cerveceria: Cerveceria)

    @Delete
    suspend fun removeFavorite(cerveceria: Cerveceria)
}