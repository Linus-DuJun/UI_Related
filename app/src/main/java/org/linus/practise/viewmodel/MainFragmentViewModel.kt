package org.linus.practise.viewmodel

import androidx.lifecycle.ViewModel
import org.linus.utils.SingleLiveEvent

class MainFragmentViewModel : ViewModel() {

    val paintAndCanvasClickEvent = SingleLiveEvent<Unit>()
    val customViewClickEvent = SingleLiveEvent<Unit>()
    val coordinatorLayoutAndNestedScrollClickEvent = SingleLiveEvent<Unit>()
    val animBasicClickEvent = SingleLiveEvent<Unit>()
    val motionLayoutClickEvent = SingleLiveEvent<Unit>()

    fun onPaintAndCanvasClick() {
        paintAndCanvasClickEvent.call()
    }

    fun onCustomViewClick() {
        customViewClickEvent.call()
    }

    fun onCoordinatorLayoutAndNestedScrollClick() {
        coordinatorLayoutAndNestedScrollClickEvent.call()
    }

    fun onAnimBasicClick() {
        animBasicClickEvent.call()
    }

    fun onMotionLayoutClick() {
        motionLayoutClickEvent.call()
    }
}