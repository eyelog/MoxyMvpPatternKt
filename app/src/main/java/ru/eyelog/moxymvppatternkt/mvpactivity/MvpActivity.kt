package ru.eyelog.moxymvppatternkt.mvpactivity

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.MAPresenter
import ru.eyelog.moxymvppatternkt.MAView
import ru.eyelog.moxymvppatternkt.R

class MvpActivity : MvpAppCompatActivity(), MAView {

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var maPresenter: MAPresenter

    @ProvidePresenterTag(presenterClass = MAPresenter::class, type = PresenterType.GLOBAL)
    fun provideMAPresenterTag(): String = "MA"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMAPresenter() = MAPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvp_activity)
    }
}
