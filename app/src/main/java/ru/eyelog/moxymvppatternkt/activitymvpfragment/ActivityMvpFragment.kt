package ru.eyelog.moxymvppatternkt.activitymvpfragment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ru.eyelog.moxymvppatternkt.R

class ActivityMvpFragment : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.mvp_activity)
    }
}