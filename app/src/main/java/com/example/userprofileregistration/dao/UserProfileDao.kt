package com.example.userprofileregistration.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.userprofileregistration.model.UserProfile

@Dao
interface UserProfileDao {
    @Insert
    suspend fun insert(userProfile: UserProfile)
    @Update
    suspend fun update(userProfile: UserProfile)
    @Delete
    suspend fun delete(userProfile: UserProfile)

    @Query("SELECT*FROM user_profile")
    fun getAllProfile():LiveData<List<UserProfile>>


}