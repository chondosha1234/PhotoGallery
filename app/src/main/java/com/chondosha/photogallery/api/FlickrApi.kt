package com.chondosha.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "7563ed2c466fc58d836345daf698f7d2"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}