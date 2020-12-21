package org.linus.practise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import org.linus.practise.databinding.ActivityMainBinding
import org.linus.practise.viewmodel.MainActivityViewModel
import org.linus.utils.extension.observe
import org.linus.utils.extension.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = viewModel() {
            observe(onMotionLayoutClickEvent) { Toast.makeText(this@MainActivity, "motion", Toast.LENGTH_LONG).show() }
        }
        binding.viewModel = viewModel
    }
}