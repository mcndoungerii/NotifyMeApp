package com.allen.notifymeapp

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color

class NotificationHelper(context:Context):ContextWrapper(context) {

    //Registering to use Notification
    val manager:NotificationManager by lazy {
        getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }

    init {
        //First Channel
        val chan1 = NotificationChannel(FIRST_CHANNEL,"First Channel",NotificationManager.IMPORTANCE_DEFAULT)
        chan1.lightColor= Color.GREEN
        chan1.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan1)

        //Second Channel
        val chan2 = NotificationChannel(SECOND_CHANNEL,"Second Channel",NotificationManager.IMPORTANCE_DEFAULT)
        chan2.lightColor= Color.GREEN
        chan2.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan2)

        //Third Channel
        val chan3 = NotificationChannel(THIRD_CHANNEL,"Third Channel",NotificationManager.IMPORTANCE_DEFAULT)
        chan3.lightColor= Color.GREEN
        chan3.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan3)
    }

    fun getNotification1(title:String,body:String):Notification.Builder{

        return Notification.Builder(applicationContext,FIRST_CHANNEL)
            .setContentTitle(title)
            .setContentText(body)
            .setSmallIcon(R.drawable.cylinder)
            .setAutoCancel(true)

    }

    fun getNotification2(title:String,body:String):Notification.Builder{

        return Notification.Builder(applicationContext,SECOND_CHANNEL)
            .setContentTitle(title)
            .setContentText(body)
            .setSmallIcon(R.drawable.cylinder)
            .setAutoCancel(true)

    }

    fun getNotification3(title:String,body:String):Notification.Builder{

        return Notification.Builder(applicationContext,THIRD_CHANNEL)
            .setContentTitle(title)
            .setContentText(body)
            .setSmallIcon(R.drawable.cylinder)
            .setAutoCancel(true)

    }
    fun Notify(id:Int,notification:Notification.Builder){
        manager.notify(id,notification.build())
    }

    companion object{
        var FIRST_CHANNEL = "first";
        var SECOND_CHANNEL = "second";
        var THIRD_CHANNEL = "third";
    }
}