package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment

import android.support.v4.app.FragmentManager
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.eyelog.moxymvppatternkt.R

@InjectViewState
class APresenter : MvpPresenter<AView>(){

    var fag = true

    fun setFragment(fragmentManager : FragmentManager){

        if (fag){
            fragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, Fragment.newInstance())
                .commit()

            fag = false
        }
    }
}