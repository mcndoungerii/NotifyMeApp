package com.allen.notifymeapp

import android.app.Notification
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var notificationHelper:NotificationHelper?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationHelper =  NotificationHelper(this)
    }

    fun ch1Click(view: View) {
        val getNotification = notificationHelper!!.getNotification1("First",etMessage.text.toString())
        notificationHelper!!.Notify(1,getNotification)
    }


    fun ch2Click(view: View) {
        val getNotification = notificationHelper!!.getNotification2("Second",etMessage.text.toString())
        notificationHelper!!.Notify(2,getNotification)
    }
    fun ch3Click(view: View) {
        val getNotification = notificationHelper!!.getNotification3("Third",etMessage.text.toString())
        notificationHelper!!.Notify(3,getNotification)
    }

}
