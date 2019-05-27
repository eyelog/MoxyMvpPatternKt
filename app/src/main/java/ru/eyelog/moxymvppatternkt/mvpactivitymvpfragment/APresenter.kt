package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment

import android.support.v4.app.FragmentManager
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.eyelog.moxymvppatternkt.R
import ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.fragmentlist.ListFragment
import ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.fragmenttext.TextFragment

@InjectViewState
class APresenter : MvpPresenter<AView>(){

    var fag = true

    fun setFragments(fragmentManager : FragmentManager){

        if (fag){
            fragmentManager
                .beginTransaction()
                .replace(R.id.frame_text, TextFragment.newInstance())
                .commit()

            fragmentManager
                .beginTransaction()
                .replace(R.id.frame_list, ListFragment.newInstance())
                .commit()
            fag = false
        }
    }
}