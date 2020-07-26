package com.et.padc_x_customassignment_eh.mpv.persenters.impls

import com.et.padc_x_customassignment_eh.mpv.persenters.AbstractBasePresenter
import com.et.padc_x_customassignment_eh.mpv.persenters.BasePresenter
import com.et.padc_x_customassignment_eh.mpv.views.BaseView


abstract class BaseAppPresenterImpl<V : BaseView> : AbstractBasePresenter<V>(), BasePresenter<V>
