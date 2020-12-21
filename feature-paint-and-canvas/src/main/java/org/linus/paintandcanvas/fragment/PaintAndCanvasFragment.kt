package org.linus.paintandcanvas.fragment

import android.os.Bundle
import org.linus.base.fragment.BaseFragment
import org.linus.paintandcanvas.R
import org.linus.paintandcanvas.databinding.FragmentPaintCanvasBinding
import org.linus.paintandcanvas.viewmodel.PaintCanvasViewModel
import org.linus.utils.extension.viewModel

class PaintAndCanvasFragment : BaseFragment<FragmentPaintCanvasBinding>() {

    lateinit var viewModel: PaintCanvasViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModel {

        }
    }

    override fun layoutId() = R.layout.fragment_paint_canvas

    override fun initBinding(binding: FragmentPaintCanvasBinding, state: Bundle?) {
        binding.viewModel = viewModel
    }
}