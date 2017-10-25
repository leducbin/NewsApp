package com.example.bin.newsapp.Common;

import com.example.bin.newsapp.Interface.IconBetterIdeaService;
import com.example.bin.newsapp.Interface.NewsService;
import com.example.bin.newsapp.Remote.IconBetterIdeaClient;
import com.example.bin.newsapp.Remote.RetrofitClient;

/**
 * Created by Bin on 10/25/2017.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";

    public static final String API_KEY = "16d1861b6a9040ef8df0012edd3e2c0a";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }
}
