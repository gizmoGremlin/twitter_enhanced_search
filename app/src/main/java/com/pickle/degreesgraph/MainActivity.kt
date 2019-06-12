package com.pickle.degreesgraph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.jaychang.sa.AuthCallback
import com.jaychang.sa.SocialUser
import com.jaychang.sa.twitter.SimpleAuth
import com.jaychang.sa.twitter.SimpleAuth.connectTwitter
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthToken
import com.twitter.sdk.android.core.TwitterSession
import com.twitter.sdk.android.core.identity.TwitterLoginButton
import com.twitter.sdk.android.core.TwitterException



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val twitterLoginBtn: Button
        val accessToken : TwitterAuthToken? =null

        if (accessToken != null) {
            val searchIntent = Intent(this@MainActivity, SearchActivity::class.java)
            startActivity(searchIntent)
        }
        twitterLoginBtn = findViewById(R.id.login_button)
        twitterLoginBtn.setOnClickListener {

            loginToTwitter()

         }



    }

    private fun loginToTwitter() {
        SimpleAuth.connectTwitter(object: AuthCallback{
            override fun onSuccess(socialUser: SocialUser?) {
                Log.d("Login", "userId:" + (socialUser?.userId ?: "empty"))
                Log.d("Login", "email:" + socialUser?.email)
                Log.d("Login", "accessToken:" + socialUser?.accessToken)
                Log.d("Login", "profilePictureUrl:" + socialUser?.profilePictureUrl)
                Log.d("Login", "username:" + socialUser?.username)
                Log.d("Login", "fullName:" + socialUser?.fullName);
                Log.d("Login", "pageLink:" + socialUser?.pageLink)

                val searchIntent = Intent(this@MainActivity,SearchActivity::class.java)
                startActivity(searchIntent)

            }

            override fun onCancel() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onError(error: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

    }
}
