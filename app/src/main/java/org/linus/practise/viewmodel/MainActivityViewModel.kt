package org.linus.practise.viewmodel

import androidx.lifecycle.ViewModel
import org.linus.utils.SingleLiveEvent

class MainActivityViewModel : ViewModel() {

    val onMotionLayoutClickEvent = SingleLiveEvent<Unit>()


    fun onMotionLayoutClick() {
        onMotionLayoutClickEvent.call()
    }
}