package com.music.daggerlearningproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.music.daggerlearningproject.data.HttpClient
import com.music.daggerlearningproject.di.component.DaggerActivityComponent
import com.music.daggerlearningproject.di.component.DaggerApplicationComponent
import com.music.daggerlearningproject.di.module.ActivityModule
import com.music.daggerlearningproject.di.module.ApplicationModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var httpClient: HttpClient


    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}

/*
  Suppose we need two separate  object view models for the same activity. for that we must go with provides
  way of providing the object  skip scoped way of  providing  object
 */
