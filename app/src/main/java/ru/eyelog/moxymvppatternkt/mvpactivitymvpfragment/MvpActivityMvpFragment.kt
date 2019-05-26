package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.R

class MvpActivityMvpFragment : MvpAppCompatActivity(), AView{

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var aPresenter : APresenter

    @ProvidePresenterTag(presenterClass = APresenter::class, type = PresenterType.GLOBAL)
    fun provideMainPresenterTag(): String = "MAMF"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMAFPresenter() = APresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvp_activity_fragment)

        aPresenter.setFragment(supportFragmentManager)

    }
}