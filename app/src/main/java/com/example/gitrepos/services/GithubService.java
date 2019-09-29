package com.example.gitrepos.services;



import com.example.gitrepos.models.GithubRepository;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryName;
import retrofit2.http.Url;

public interface GithubService {

    @GET("/users/{user}/repos")
    Call<ArrayList<GithubRepository>>userRepos(@Path("user") String user,@Query("page") String page);

}
