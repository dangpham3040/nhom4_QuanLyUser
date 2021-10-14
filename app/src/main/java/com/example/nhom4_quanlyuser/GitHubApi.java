package com.example.nhom4_quanlyuser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Class that details the request(s) that we will call
 */

public interface GitHubApi {

    @GET("users")
    Call<List<UserModel>> loadUser(

    );
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
