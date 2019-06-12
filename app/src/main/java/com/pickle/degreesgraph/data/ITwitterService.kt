package com.pickle.degreesgraph.data

import com.pickle.degreesgraph.models.UserObject
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface ITwitterService {

    @GET("/1.1/followers/list.json")
   fun getFollowers(@Query("screen_name")screenName:String, @Query("cursor")cursor:Int=-1): Observable<List<UserObject>>

}