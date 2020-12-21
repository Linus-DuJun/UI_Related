package org.linus.practise.fragment

import android.os.Bundle
import android.widget.Toast
import org.linus.base.fragment.BaseFragment
import org.linus.practise.R
import org.linus.practise.databinding.FragmentMainBinding
import org.linus.practise.viewmodel.MainFragmentViewModel
import org.linus.utils.extension.observe
import org.linus.utils.extension.viewModel

class MainFragment : BaseFragment<FragmentMainBinding>() {

    lateinit var viewModel: MainFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModel {
            observe(paintAndCanvasClickEvent) { launchPaintAndCanvasModule() }
            observe(customViewClickEvent) { launchCustomViewModule() }
            observe(coordinatorLayoutAndNestedScrollClickEvent) { launchCoordinatorLayoutAndNestedScrollModule() }
            observe(animBasicClickEvent) { launchAnimBasicModule() }
            observe(motionLayoutClickEvent) { launchMotionLayoutModule() }
        }
    }

    override fun layoutId() = R.layout.fragment_main

    override fun initBinding(binding: FragmentMainBinding, state: Bundle?) {
        binding.viewModel = viewModel
    }

    private fun launchPaintAndCanvasModule() {
        Toast.makeText(activity, "go to Paint", Toast.LENGTH_LONG).show()
    }

    private fun launchCustomViewModule() {
        Toast.makeText(activity, "go to Custom view", Toast.LENGTH_LONG).show()
    }

    private fun launchCoordinatorLayoutAndNestedScrollModule() {
        Toast.makeText(activity, "go to Coordinator", Toast.LENGTH_LONG).show()
    }

    private fun launchAnimBasicModule() {
        Toast.makeText(activity, "go to Anim", Toast.LENGTH_LONG).show()
    }

    private fun launchMotionLayoutModule() {
        navController.navigate(MainFragmentDirections.toMotionLayoutModule())
    }
}