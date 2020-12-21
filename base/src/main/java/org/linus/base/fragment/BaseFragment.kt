package org.linus.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

abstract class BaseFragment<T : ViewDataBinding> : Fragment() {


    lateinit var binding: T
    lateinit var navController: NavController

    abstract fun layoutId(): Int
    abstract fun initBinding(binding: T, state: Bundle?)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId(), container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        // Workaround for http://stackoverflow.com/questions/27057449/when-switch-fragment-with-swiperefreshlayout-during-refreshing-fragment-freezes
        return if (binding.root is SwipeRefreshLayout) FrameLayout(requireContext()).apply { addView(binding.root) }
        else binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initBinding(binding, savedInstanceState)
    }
}