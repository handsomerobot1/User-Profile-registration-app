package com.example.userprofileregistration.repository

import androidx.lifecycle.LiveData
import com.example.userprofileregistration.dao.UserProfileDao
import com.example.userprofileregistration.model.UserProfile

class UserProfileRepository (private val userProfileDao: UserProfileDao){
    fun getUserProfiles():LiveData<List<UserProfile>>{
        return userProfileDao.getAllProfile()
    }
    suspend fun insert(userProfile: UserProfile){
        return userProfileDao.insert(userProfile)
    }
    suspend fun update(userProfile: UserProfile){
        return userProfileDao.update(userProfile)
    }
    suspend fun delete(userProfile: UserProfile){
        return userProfileDao.delete(userProfile)
    }
}