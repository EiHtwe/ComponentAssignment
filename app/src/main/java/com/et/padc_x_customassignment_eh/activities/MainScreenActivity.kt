package com.et.padc_x_customassignment_eh.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.et.padc_x_customassignment_eh.R
import com.et.padc_x_customassignment_eh.adapters.ProfileListRecyclerAdapter
import com.et.padc_x_customassignment_eh.data.vo.ProfileVO
import com.et.padc_x_customassignment_eh.mpv.persenters.MainPresenter
import com.et.padc_x_customassignment_eh.mpv.persenters.impls.MainPresenterImpl
import com.et.padc_x_customassignment_eh.mpv.views.MainView
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreenActivity : AppCompatActivity(), MainView {

    private lateinit var mPresenter : MainPresenter
    private lateinit var mAdapter : ProfileListRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        setUpPresenter()
        setUpRecyclerView()
        setUpListeners()
        mPresenter.onUiReady(this)
    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProviders.of(this).get(MainPresenterImpl::class.java)
        mPresenter.onUiReady(this)
    }

    private fun setUpRecyclerView() {
        mAdapter = ProfileListRecyclerAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile_list.layoutManager = linearLayoutManager
        rv_profile_list.adapter = mAdapter
    }

    private fun setUpListeners() {
        iv_profile4.setOnClickListener {
            mPresenter.onTapAddBtn()
        }
    }

    override fun displayProfileList(list: List<ProfileVO>) {
        mAdapter.setNewData(list.toMutableList())
    }

    override fun navigateToProfileScreen() {
        startActivity(ProfileActivity.newIntent(this))
    }

    override fun navigateToCreateTask() {
        startActivity(CreateTaskActivity.newIntent(this))
    }
}
