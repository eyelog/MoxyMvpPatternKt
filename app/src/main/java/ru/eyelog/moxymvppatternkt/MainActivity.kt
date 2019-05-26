package ru.eyelog.moxymvppatternkt

import android.content.Intent
import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import kotlinx.android.synthetic.main.activity_main.*
import ru.eyelog.moxymvppatternkt.mvpactivity.MvpActivity
import ru.eyelog.moxymvppatternkt.mvpactivityfragment.MvpActivityFragment
import ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.MvpActivityMvpFragment

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var mainPresenter: MainPresenter

    @ProvidePresenterTag(presenterClass = MainPresenter::class, type = PresenterType.GLOBAL)
    fun provideMainPresenterTag(): String = "Main"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMainPresenter() = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_00.setOnClickListener {
            val intent = Intent(applicationContext, MvpActivity::class.java)
            startActivity(intent)
        }

        button_01.setOnClickListener {
            val intent = Intent(applicationContext, MvpActivityFragment::class.java)
            startActivity(intent)
        }

        button_02.setOnClickListener {
            val intent = Intent(applicationContext, MvpActivityFragment::class.java)
            startActivity(intent)
        }

        button_03.setOnClickListener {
            val intent = Intent(applicationContext, MvpActivityMvpFragment::class.java)
            startActivity(intent)
        }
    }
}
