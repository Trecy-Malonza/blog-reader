package com.akirachix.blog_reader

import android.icu.text.CaseMap.Title
import android.net.wifi.MloLink
import android.provider.ContactsContract.CommonDataKinds.Photo
import kotlinx.coroutines.FlowPreview
import java.sql.Date

data class Blog(
    var author:String,
    var title: String,
    var publishingDate: String,
    var blogPreview: String,
    var articlePhoto: String,
    var articleLink: String

)
