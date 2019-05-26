package ru.eyelog.moxymvppatternkt.mvpactivityfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.R

class LocalFragment : Fragment(){

//    @InjectPresenter
//    lateinit var lfPresenter: LFPresenter
//
//    @ProvidePresenterTag(presenterClass = LFPresenter::class, type = PresenterType.GLOBAL)
//    fun provideLFPresenterTag(): String = "LF"
//
//    @ProvidePresenter(type = PresenterType.GLOBAL)
//    fun provideLFPresenter() = LFPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment, container, false)

    }

    companion object {
        fun newInstance(): LocalFragment {
            val localFragment = LocalFragment()
            val args = Bundle()
            localFragment.arguments = args
            return localFragment
        }
    }
}