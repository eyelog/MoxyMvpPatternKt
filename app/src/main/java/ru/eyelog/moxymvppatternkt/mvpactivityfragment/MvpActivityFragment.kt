package ru.eyelog.moxymvppatternkt.mvpactivityfragment

import android.os.Bundle
import android.support.v4.app.FragmentManager
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.MAPresenter
import ru.eyelog.moxymvppatternkt.R

class MvpActivityFragment : MvpAppCompatActivity(), MAFView{

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var mafPresenter : MAFPresenter

    @ProvidePresenterTag(presenterClass = MAFPresenter::class, type = PresenterType.GLOBAL)
    fun provideMainPresenterTag(): String = "MAF"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMAFPresenter() = MAFPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvp_activity_fragment)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, LocalFragment.newInstance())
            .commit()

    }
}