package com.example.navegacionjpc.api

import com.example.navegacionjpc.modelo.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
        @GET("users")
        fun getUsers(): Call<List<User>>

}