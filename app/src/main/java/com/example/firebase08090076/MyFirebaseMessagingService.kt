package com.example.firebase08090076

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.e("FireBase", "onNewToken $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        Log.e("FireBase", "onMessageReceived")

        message?.let {
            Log.e("FireBase", it.from.toString())
            for(entry in  it.data.entries)
                Log.e("message", "${entry.key}/${entry.value}")
        }
    }
}