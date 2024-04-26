package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo("wish_title")
    val title : String="",
    @ColumnInfo("wish_desc")
    val description : String =""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Iphone 15", description = "Apple iphone 15"),
        Wish(title = "Playstation 5" , description = "Sony Playstation 5"),
        Wish(title = "Xbox controller", description = "Xbox controller for playing games")
    )
}
