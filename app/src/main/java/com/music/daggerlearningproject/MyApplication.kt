package com.music.daggerlearningproject

import android.app.Application
import com.music.daggerlearningproject.data.HttpClient
import com.music.daggerlearningproject.di.component.ApplicationComponent
import com.music.daggerlearningproject.di.component.DaggerApplicationComponent
import com.music.daggerlearningproject.di.module.ApplicationModule
import javax.inject.Inject


class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var httpClient: HttpClient

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}

//.applicationModule(ApplicationModule(this))
//if u see this as deprecated bcz whatever the module is providing we are not using this
// only then it will be deprecated

