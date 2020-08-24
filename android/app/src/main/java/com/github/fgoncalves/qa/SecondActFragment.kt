package com.github.fgoncalves.qa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.fgoncalves.qa.databinding.FragmentSecondActBinding

class SecondActFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSecondActBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_second_act, container, false
        )
        return binding.root
    }
}
