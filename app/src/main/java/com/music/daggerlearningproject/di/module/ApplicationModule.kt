package com.music.daggerlearningproject.di.module

import android.content.Context
import com.music.daggerlearningproject.MyApplication
import com.music.daggerlearningproject.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext():Context{
        return application
    }

}