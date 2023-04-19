package com.chondosha.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "7563ed2c466fc58d836345daf698f7d2"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest/?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}