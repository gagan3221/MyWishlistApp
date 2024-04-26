package com.example.mywishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {

    suspend fun addAWish(wish: Wish){
       return wishDao.addAWish(wish)
    }
    fun getWish(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id:Long) : Flow<Wish>{
        return  wishDao.getAWishById(id)
    }
    suspend fun updateAWish(wish: Wish){
        wishDao.updateAWish(wish)
    }
    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}