package com.music.daggerlearningproject.di.component

import android.app.Application
import com.music.daggerlearningproject.MyApplication
import com.music.daggerlearningproject.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)
}