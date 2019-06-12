package com.pickle.degreesgraph.ui

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders
import com.pickle.degreesgraph.DegreeGraph

class FollowerViewModel : ViewModel() {
    companion object {
        private var INSTANCE: FollowerViewModel? = null

        private val recipeRepository = DegreeGraph.injectRepo()

        fun getInstance(activity: FragmentActivity): FollowerViewModel? {
            if (INSTANCE == null) {
                INSTANCE = ViewModelProviders.of(activity).get(FollowerViewModel::class.java)
            }
            return INSTANCE
        }
    }
}
