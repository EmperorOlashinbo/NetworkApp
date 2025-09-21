package com.example.networkapp

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("posts/{id}")
    suspend fun getPost(@Path("id") id: Int): PostResponse
}

data class PostResponse(
    val id: Int,
    val title: String,
    val body: String,
    val userId: Int
)