package ru.eyelog.moxymvppatternkt.mvpactivitymvpfragment.fragmentlist

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import ru.eyelog.moxymvppatternkt.utils.DataClass

@StateStrategyType(AddToEndSingleStrategy::class)
interface LFView : MvpView{
    fun setData(data: List<DataClass>)
}