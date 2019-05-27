package ru.eyelog.moxymvppatternkt.mvpactivity

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import kotlinx.android.synthetic.main.mvp_activity_landscape.*
import kotlinx.android.synthetic.main.mvp_activity_portrait.*
import ru.eyelog.moxymvppatternkt.MAPresenter
import ru.eyelog.moxymvppatternkt.MAView
import ru.eyelog.moxymvppatternkt.R
import ru.eyelog.moxymvppatternkt.utils.DataClass
import ru.eyelog.moxymvppatternkt.utils.RVAdapter

class MvpActivity : MvpAppCompatActivity(), MAView {

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var maPresenter: MAPresenter

    @ProvidePresenterTag(presenterClass = MAPresenter::class, type = PresenterType.GLOBAL)
    fun provideMAPresenterTag(): String = "MA"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMAPresenter() = MAPresenter()

    lateinit var listView: RecyclerView

    lateinit var adapter: RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.mvp_activity_portrait)
            listView = recycler_view_portrait
        }else{
            setContentView(R.layout.mvp_activity_landscape)
            listView = recycler_view_landscape
        }

        maPresenter.getData()
    }

    override fun setData(data: List<DataClass>) {
        adapter = RVAdapter(data)
        listView.layoutManager = LinearLayoutManager(applicationContext)
        listView.adapter = adapter
    }
}
