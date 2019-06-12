package com.pickle.degreesgraph.models
import com.google.gson.annotations.SerializedName


data class UserObject(
    @SerializedName("protected")
    val `protected`: Boolean,
    @SerializedName("contributors_enabled")
    val contributorsEnabled: Any,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("default_profile")
    val defaultProfile: Boolean,
    @SerializedName("default_profile_image")
    val defaultProfileImage: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("entities")
    val entities: Entities,
    @SerializedName("favourites_count")
    val favouritesCount: Int,
    @SerializedName("follow_request_sent")
    val followRequestSent: Any,
    @SerializedName("followers_count")
    val followersCount: Int,
    @SerializedName("following")
    val following: Any,
    @SerializedName("friends_count")
    val friendsCount: Int,
    @SerializedName("geo_enabled")
    val geoEnabled: Any,
    @SerializedName("has_extended_profile")
    val hasExtendedProfile: Any,
    @SerializedName("id")
    val id: Int,
    @SerializedName("id_str")
    val idStr: String,
    @SerializedName("is_translation_enabled")
    val isTranslationEnabled: Any,
    @SerializedName("is_translator")
    val isTranslator: Any,
    @SerializedName("lang")
    val lang: Any,
    @SerializedName("listed_count")
    val listedCount: Int,
    @SerializedName("location")
    val location: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("notifications")
    val notifications: Any,
    @SerializedName("profile_background_color")
    val profileBackgroundColor: Any,
    @SerializedName("profile_background_image_url")
    val profileBackgroundImageUrl: Any,
    @SerializedName("profile_background_image_url_https")
    val profileBackgroundImageUrlHttps: Any,
    @SerializedName("profile_background_tile")
    val profileBackgroundTile: Any,
    @SerializedName("profile_banner_url")
    val profileBannerUrl: Any,
    @SerializedName("profile_image_url")
    val profileImageUrl: Any,
    @SerializedName("profile_image_url_https")
    val profileImageUrlHttps: String,
    @SerializedName("profile_link_color")
    val profileLinkColor: Any,
    @SerializedName("profile_location")
    val profileLocation: Any,
    @SerializedName("profile_sidebar_border_color")
    val profileSidebarBorderColor: Any,
    @SerializedName("profile_sidebar_fill_color")
    val profileSidebarFillColor: Any,
    @SerializedName("profile_text_color")
    val profileTextColor: Any,
    @SerializedName("profile_use_background_image")
    val profileUseBackgroundImage: Any,
    @SerializedName("screen_name")
    val screenName: String,
    @SerializedName("statuses_count")
    val statusesCount: Int,
    @SerializedName("time_zone")
    val timeZone: Any,
    @SerializedName("translator_type")
    val translatorType: Any,
    @SerializedName("url")
    val url: String,
    @SerializedName("utc_offset")
    val utcOffset: Any,
    @SerializedName("verified")
    val verified: Boolean
)

data class Entities(
    @SerializedName("description")
    val description: Description,
    @SerializedName("url")
    val url: Url
)

data class Url(
    @SerializedName("urls")
    val urls: List<UrlX>
)

data class UrlX(
    @SerializedName("display_url")
    val displayUrl: String,
    @SerializedName("expanded_url")
    val expandedUrl: String,
    @SerializedName("indices")
    val indices: List<Int>,
    @SerializedName("url")
    val url: String
)

data class Description(
    @SerializedName("urls")
    val urls: List<Any>
)