package com.jutaav.baseandroid

import com.jutaav.base.RxSchedulers
import io.reactivex.rxjava3.core.Scheduler

/**
 * Created by viking_93 on 30/12/2020
 **/

internal data class AppRxSchedulers(
    override val main: Scheduler,
    override val io: Scheduler,
    override val common: Scheduler
) : RxSchedulers