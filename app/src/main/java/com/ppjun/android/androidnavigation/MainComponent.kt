package com.ppjun.android.androidnavigation

import dagger.Component


@Component
interface MainComponent {
    fun inject(activity:MainActivity)
}