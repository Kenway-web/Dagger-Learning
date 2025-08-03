package com.music.daggerlearningproject.di.component

import com.music.daggerlearningproject.ScreeFragment
import com.music.daggerlearningproject.di.FragmentScope
import com.music.daggerlearningproject.di.module.FragmentModule
import dagger.Component


@FragmentScope
@Component(dependencies = [ApplicationComponent::class],modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(fragment: ScreeFragment)
}