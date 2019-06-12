package com.pickle.degreesgraph.models
import com.google.gson.annotations.SerializedName


data class Followers(
    @SerializedName("next_cursor")
    val nextCursor: Long = 0,
    @SerializedName("next_cursor_str")
    val nextCursorStr: String = "",
    @SerializedName("previous_cursor")
    val previousCursor: Int = 0,
    @SerializedName("previous_cursor_str")
    val previousCursorStr: String = "",
    @SerializedName("users")
    val users: List<UserObject> = listOf()

)

