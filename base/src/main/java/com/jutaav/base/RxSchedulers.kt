package com.jutaav.base

import io.reactivex.rxjava3.core.Scheduler

/**
 * Created by viking_93 on 30/12/2020
 **/

interface RxSchedulers {
    val main: Scheduler
    val io: Scheduler
    val common: Scheduler
}