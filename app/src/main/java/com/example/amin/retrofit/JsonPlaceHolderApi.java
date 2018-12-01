package com.example.amin.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
//Retrofit turns your HTTP API into a Java interface.
public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();
}
