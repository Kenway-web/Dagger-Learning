package com.music.daggerlearningproject

import com.music.daggerlearningproject.data.HttpClient
import com.music.daggerlearningproject.di.ActivityScope
import javax.inject.Inject


@ActivityScope
class MainViewModel  @Inject constructor(private val httpClient: HttpClient) {

}