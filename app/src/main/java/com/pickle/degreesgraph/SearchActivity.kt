package com.pickle.degreesgraph

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import com.pickle.degreesgraph.ui.FollowerFragment

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FollowerFragment())
            .commit()

    }

}
