package com.music.daggerlearningproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.music.daggerlearningproject.di.component.DaggerActivityComponent
import com.music.daggerlearningproject.di.component.DaggerFragmentComponent
import com.music.daggerlearningproject.di.module.ActivityModule
import com.music.daggerlearningproject.di.module.FragmentModule

class ScreeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()   // <-- Also fine
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scree, container, false)
    }

    private fun getDependencies() {
        DaggerFragmentComponent
            .builder()
            .applicationComponent((requireContext() as MyApplication).applicationComponent)
            .fragmentModule(FragmentModule(this))
            .build()
            .inject(this)
    }

}