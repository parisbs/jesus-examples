package com.example.jesus

import android.app.Application
import com.example.jesus.main.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class Jesus : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeDependencyInjection(this)
    }

    private fun initializeDependencyInjection(application: Application) {
        startKoin {
            androidContext(application)
            androidLogger()
            androidFileProperties()
            modules(
                listOf(
                    mainModule
                )
            )
        }
    }
}
