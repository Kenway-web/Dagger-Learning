package com.music.daggerlearningproject.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.music.daggerlearningproject.di.FragmentScope
import dagger.Module
import dagger.Provides


@Module
class FragmentModule(private val fragment: Fragment) {
    @FragmentScope
    @Provides
    fun provideFragmentContext(): Context {
        return fragment.requireContext()
    }
}