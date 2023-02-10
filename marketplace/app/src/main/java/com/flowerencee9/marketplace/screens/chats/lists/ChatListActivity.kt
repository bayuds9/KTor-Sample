package com.flowerencee9.marketplace.screens.chats.lists

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.databinding.ActivityMessagesBinding

class ChatListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessagesBinding

    companion object {
        private val TAG = ChatListActivity::class.java.simpleName
        fun myIntent(context: Context) = Intent(context, ChatListActivity::class.java)
    }

}