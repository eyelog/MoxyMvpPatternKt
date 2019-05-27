package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.R
import ru.eyelog.moxymvppatternkt.utils.RVAdapter

class MvpActivityMvpFragment : MvpAppCompatActivity(), AView{

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var aPresenter : APresenter

    @ProvidePresenterTag(presenterClass = APresenter::class, type = PresenterType.GLOBAL)
    fun provideMainPresenterTag(): String = "MAMF"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMAFPresenter() = APresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.mvp_activity_fragment_portrait)
        }else{
            setContentView(R.layout.mvp_activity_fragment_landscape)
        }

        aPresenter.setFragments(supportFragmentManager)

    }
}