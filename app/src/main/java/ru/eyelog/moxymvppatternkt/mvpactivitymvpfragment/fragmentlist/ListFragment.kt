package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.fragmentlist

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag
import ru.eyelog.moxymvppatternkt.R
import ru.eyelog.moxymvppatternkt.utils.DataClass
import ru.eyelog.moxymvppatternkt.utils.RVAdapter

class ListFragment : MvpAppCompatFragment(), LFView {

    @InjectPresenter
    lateinit var lfPresenter: LFPresenter

    @ProvidePresenterTag(presenterClass = LFPresenter::class, type = PresenterType.GLOBAL)
    fun provideLFPresenterTag(): String = "FP"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideLFPresenter() = LFPresenter()

    lateinit var listView: RecyclerView

    lateinit var adapter: RVAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_list, container, false)

        listView = rootView.findViewById(R.id.recycler_view)

        lfPresenter.getData()

        return rootView

    }

    override fun setData(data: List<DataClass>) {
        adapter = RVAdapter(data)
        listView.layoutManager = LinearLayoutManager(context)
        listView.adapter = adapter
    }

    companion object {
        fun newInstance(): ListFragment {
            val fragment = ListFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}