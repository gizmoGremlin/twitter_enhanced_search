package com.pickle.degreesgraph

import android.app.Application
import com.twitter.sdk.android.core.Twitter
import android.R
import android.util.Log
import com.pickle.degreesgraph.data.ITwitterService
import com.pickle.degreesgraph.data.Repository
import com.twitter.sdk.android.core.TwitterAuthConfig
import com.twitter.sdk.android.core.DefaultLogger
import com.twitter.sdk.android.core.TwitterConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class DegreeGraph : Application() {
    val BASE_URL="https://api.twitter.com/"

    init {
        instance = this
    }

    companion object{
        private lateinit var retrofit: Retrofit
        private lateinit var repository: Repository
        private lateinit var service: ITwitterService
        private var instance :DegreeGraph? = null

        fun injectRepo() = repository

        fun applicationContext():DegreeGraph{
            return instance as DegreeGraph
        }
    }


    override fun onCreate() {
        super.onCreate()

        retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        service = retrofit.create(ITwitterService::class.java)
        repository = Repository(service)
    }
}