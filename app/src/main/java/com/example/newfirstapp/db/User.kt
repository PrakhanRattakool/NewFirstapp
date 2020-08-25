package com.example.newfirstapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class User {
    @Entity(tableName = "User")
    class Word(@PrimaryKey @ColumnInfo(name = "User") val word: String)
}