package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.fragmenttext

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

class TextFragment : MvpAppCompatFragment(), TFView {

    @InjectPresenter
    lateinit var tfPresenter: TFPresenter

    @ProvidePresenterTag(presenterClass = TFPresenter::class, type = PresenterType.GLOBAL)
    fun provideLFPresenterTag(): String = "FP"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideLFPresenter() = TFPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_text, container, false)

    }

    companion object {
        fun newInstance(): TextFragment {
            val fragment = TextFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}