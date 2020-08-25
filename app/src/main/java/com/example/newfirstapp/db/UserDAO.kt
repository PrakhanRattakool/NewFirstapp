package com.example.newfirstapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

class UserDAO {
    @Dao
    interface WordDao {

        @Query("SELECT * from user ORDER BY User ASC")
        fun getAlphabetizedWords(): List<User.Word>

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun insert(word: User.Word)

        @Query("DELETE FROM user")
        suspend fun deleteAll()
    }
}