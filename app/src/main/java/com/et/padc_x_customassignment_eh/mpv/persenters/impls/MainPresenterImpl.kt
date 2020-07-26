package com.et.padc_x_customassignment_eh.mpv.persenters.impls

import android.widget.ImageView
import androidx.lifecycle.LifecycleOwner
import com.et.padc_x_customassignment_eh.data.dummy_data.getDummyPeopleList
import com.et.padc_x_customassignment_eh.data.vo.ProfileVO
import com.et.padc_x_customassignment_eh.mpv.persenters.MainPresenter
import com.et.padc_x_customassignment_eh.mpv.views.MainView

class MainPresenterImpl : MainPresenter, BaseAppPresenterImpl<MainView>() {

    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayProfileList(getDummyPeopleList())
    }

    override fun onTap(entity: ProfileVO, profileImage: ImageView) {
        mView?.navigateToProfileScreen()
    }

    override fun onTapAddBtn() {
        mView?.navigateToCreateTask()
    }


}