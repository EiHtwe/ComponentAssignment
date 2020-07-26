package com.et.padc_x_customassignment_eh.mpv.persenters
import androidx.lifecycle.ViewModel
import com.et.padc_x_customassignment_eh.mpv.views.BaseView

abstract class AbstractBasePresenter<T : BaseView> : BasePresenter<T>, ViewModel() {
    var mView: T? = null

    override fun initPresenter(view: T) {
        mView = view
    }
}