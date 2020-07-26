package com.et.padc_x_customassignment_eh.mpv.persenters

import androidx.lifecycle.LifecycleOwner
import com.et.padc_x_customassignment_eh.delegates.ProfileListActionDelegate
import com.et.padc_x_customassignment_eh.mpv.views.MainView

interface MainPresenter : BasePresenter<MainView>, ProfileListActionDelegate {
    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}
