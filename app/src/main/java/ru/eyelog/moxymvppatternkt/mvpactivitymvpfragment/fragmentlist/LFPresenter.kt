package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.fragmentlist

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.eyelog.moxymvppatternkt.utils.MockListData

@InjectViewState
class LFPresenter : MvpPresenter<LFView>(){

    fun getData(){
        val data = MockListData.generateMockData()
        viewState.setData(data)
    }
}