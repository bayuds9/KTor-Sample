package com.flowerencee9.marketplace.screens.chats.lists

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.databinding.ActivityMessagesBinding

class ChatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessagesBinding

    companion object {
        private val TAG = ChatActivity::class.java.simpleName
        fun myIntent(context: Context) = Intent(context, ChatActivity::class.java)
    }

}