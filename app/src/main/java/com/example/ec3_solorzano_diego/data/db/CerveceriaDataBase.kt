package com.example.ec3_solorzano_diego.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ec3_solorzano_diego.model.Cerveceria@Database(entities = [Cerveceria::class], version = 1)
abstract class CerveceriaDataBase: RoomDatabase()  {
    abstract fun CerveceriaDao(): CerveceriaDao

    companion object{
        @Volatile
        private var instance: CerveceriaDataBase? = null
        fun getDatabase(context: Context): CerveceriaDataBase{
            if (instance == null){
                synchronized(this){
                    instance = buildDatabase(context)
                }
            }
            return instance!!
        }

        private fun buildDatabase(context: Context): CerveceriaDataBase? {
            return Room.databaseBuilder(
                context.applicationContext,
                CerveceriaDataBase::class.java,
                "cerveceria_database"
            ).build()
        }
    }

}

