package com.example.bin.newsapp.Interface;

import com.example.bin.newsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Bin on 10/25/2017.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSources();

}
