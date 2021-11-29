package com.example.propert_app.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public  class  RetrofitInstance {

   private static final String BASE_URL = "http://admin.keystonemarketingltd.com/api/";
   private static final String BASE_URL1 = "http://howmobile.howapp.me";
   private static final String BASE_URL2 = "https://firebasedynamiclinks.googleapis.com";
   private static Retrofit retrofit;
   private static Retrofit retrofit1;
   private static Retrofit retrofit2;
 private static  OkHttpClient okHttpClient = new OkHttpClient.Builder()
           .connectTimeout(60, TimeUnit.SECONDS)
           .writeTimeout(60, TimeUnit.SECONDS)
           .readTimeout(60, TimeUnit.SECONDS)
           .build();

   public static Retrofit getRetrofitInstance() {
       if (retrofit == null) {
           retrofit = new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .client(okHttpClient)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit;
   }
   public static Retrofit getRetrofitInstance1() {
       if (retrofit1 == null) {
           retrofit1 = new Retrofit.Builder()
                   .baseUrl(BASE_URL1)
                   .client(okHttpClient)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit1;
   }
    public static Retrofit getRetrofitInstance3() {
        if (retrofit2 == null) {
            retrofit2 = new Retrofit.Builder()
                    .baseUrl(BASE_URL2)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit2;
    }
}
