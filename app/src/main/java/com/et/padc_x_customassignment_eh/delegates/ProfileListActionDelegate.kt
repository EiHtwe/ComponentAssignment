package com.et.padc_x_customassignment_eh.delegates

import android.widget.ImageView
import com.et.padc_x_customassignment_eh.data.vo.ProfileVO


interface ProfileListActionDelegate {
    fun onTap(entity : ProfileVO, profileImage: ImageView)
    fun onTapAddBtn()
}