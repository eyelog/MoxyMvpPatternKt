package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.R

class Fragment : MvpAppCompatFragment(), FView{

    @InjectPresenter
    lateinit var fPresenter: FPresenter

    @ProvidePresenterTag(presenterClass = FPresenter::class, type = PresenterType.GLOBAL)
    fun provideLFPresenterTag(): String = "FP"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideLFPresenter() = FPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment, container, false)

    }

    companion object {
        fun newInstance(): Fragment {
            val fragment = Fragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}