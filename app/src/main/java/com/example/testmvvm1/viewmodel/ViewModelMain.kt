package com.example.testmvvm1.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMain : ViewModel() {

    val livedata = MutableLiveData<String>()

init {
    starttimer()
}

    fun starttimer(){
        object : CountDownTimer(20000, 1000){
            override fun onTick(millisUntilFinished: Long) {
                livedata.value = (millisUntilFinished/1000).toString()
            }

            override fun onFinish() {

            }

        }.start()
    }

}