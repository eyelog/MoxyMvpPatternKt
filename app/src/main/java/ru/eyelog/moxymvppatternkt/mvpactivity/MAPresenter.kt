package ru.eyelog.moxymvppatternkt

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.eyelog.moxymvppatternkt.utils.MockListData

@InjectViewState
class MAPresenter : MvpPresenter<MAView>(){

    fun getData(){
        val data = MockListData.generateMockData()
        viewState.setData(data)
    }
}