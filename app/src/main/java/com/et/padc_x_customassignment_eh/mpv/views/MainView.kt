package com.et.padc_x_customassignment_eh.mpv.views

import com.et.padc_x_customassignment_eh.data.vo.ProfileVO

interface MainView : BaseView {
    fun displayProfileList(list: List<ProfileVO>)
    fun navigateToProfileScreen()
    fun navigateToCreateTask()
}