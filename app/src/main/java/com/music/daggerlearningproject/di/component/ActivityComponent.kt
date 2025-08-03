package com.music.daggerlearningproject.di.component

import com.music.daggerlearningproject.MainActivity
import com.music.daggerlearningproject.di.ActivityScope
import com.music.daggerlearningproject.di.module.ActivityModule
import dagger.Component


@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}

//dependencies = [ApplicationComponent::class] contract to expose the depenecny from application component to activity