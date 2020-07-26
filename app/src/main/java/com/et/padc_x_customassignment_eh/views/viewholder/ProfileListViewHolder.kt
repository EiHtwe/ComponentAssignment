package com.et.padc_x_customassignment_eh.views.viewholder

import android.view.View
import android.widget.ImageView
import com.et.padc_x_customassignment_eh.data.vo.ProfileVO
import com.et.padc_x_customassignment_eh.delegates.ProfileListActionDelegate
import kotlinx.android.synthetic.main.view_item_profile_detail.view.*

class ProfileListViewHolder(itemView: View, private val mDelegate: ProfileListActionDelegate)
    : BaseViewHolder<ProfileVO>(itemView) {

    init {
        itemView.image.setOnClickListener {
            mData?.let {
                mDelegate.onTap(it, itemView.image as ImageView)
            }
        }
    }

    override fun bindData(data: ProfileVO) {
        mData = data

        itemView.tv_status.text = data.status

    }
}