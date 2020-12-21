package org.linus.motionlayout.fragment

import android.os.Bundle
import org.linus.base.fragment.BaseFragment
import org.linus.motionlayout.R
import org.linus.motionlayout.databinding.FragmentMotionLayoutBinding
import org.linus.motionlayout.viewmodel.MotionLayoutViewModel
import org.linus.utils.extension.viewModel

class MotionLayoutFragment : BaseFragment<FragmentMotionLayoutBinding>() {

    lateinit var viewModel: MotionLayoutViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModel {

        }
    }

    override fun layoutId() = R.layout.fragment_motion_layout

    override fun initBinding(binding: FragmentMotionLayoutBinding, state: Bundle?) {
         binding.viewModel = viewModel
    }
}