package com.pickle.degreesgraph.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.pickle.degreesgraph.models.UserObject
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class Repository(val twitterService: ITwitterService) {

    private var followersMediatedList: MediatorLiveData<List<UserObject>> = MediatorLiveData()

    private var remotefollowersList: MutableLiveData<List<UserObject>> = MutableLiveData()






    private fun addFollowersListSource(screenName:String,cursor:Int){
        //check timeStamp   timestamp = System.currentTimeMillis()
        //check room is user exists and timestam with in 10 min else service call


         twitterService.getFollowers(screenName,cursor)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe({ it ->
                 remotefollowersList.postValue(it)

             })
    }

}