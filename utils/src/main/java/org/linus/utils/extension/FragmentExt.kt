package org.linus.utils.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

inline fun <reified T : ViewModel> Fragment.viewModel(body: T.() -> Unit): T {
    val vm = ViewModelProvider(this)[T::class.java]
    vm.body()
    return vm
}

inline fun <reified T : ViewModel> Fragment.viewModelInActivityScope(body: T.() -> Unit): T {
    return activity?.let {
        val vm = ViewModelProvider(it)[T::class.java]
        vm.body()
        vm
    } ?: throw IllegalStateException("Not possible to create view model for nullable hosted activity")
}