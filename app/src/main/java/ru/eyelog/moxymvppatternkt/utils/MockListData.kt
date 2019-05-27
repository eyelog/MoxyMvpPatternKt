package ru.eyelog.moxymvppatternkt.utils

open class MockListData {
    companion object{
        fun generateMockData():List<DataClass>{
            var data = ArrayList<DataClass>()

            for (i in 0..20){
                val dataClass = DataClass(
                    "Title $i",
                    "Sub title $i"
                )

                data.add(dataClass)
            }

            return data
        }
    }
}