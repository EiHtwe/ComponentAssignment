package com.et.padc_x_customassignment_eh.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.et.padc_x_customassignment_eh.R
import com.et.padc_x_customassignment_eh.data.vo.ProfileVO
import com.et.padc_x_customassignment_eh.delegates.ProfileListActionDelegate
import com.et.padc_x_customassignment_eh.views.viewholder.ProfileListViewHolder

class ProfileListRecyclerAdapter(private val mDelegate : ProfileListActionDelegate) :
    BaseRecyclerAdapter<ProfileListViewHolder, ProfileVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_profile_detail,parent,false)
        return ProfileListViewHolder(view, mDelegate)
    }
}