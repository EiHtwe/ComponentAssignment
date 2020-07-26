package com.et.padc_x_customassignment_eh.mpv.persenters

import com.et.padc_x_customassignment_eh.mpv.views.BaseView

interface BasePresenter<T : BaseView> {
    fun initPresenter(view: T)
}