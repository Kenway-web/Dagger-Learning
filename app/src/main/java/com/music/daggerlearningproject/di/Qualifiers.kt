package com.music.daggerlearningproject.di

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApplicationContext


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ActivityContext

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.BINARY)
annotation class FragmentScope

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseName


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseVersion

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NetworkApiKey
