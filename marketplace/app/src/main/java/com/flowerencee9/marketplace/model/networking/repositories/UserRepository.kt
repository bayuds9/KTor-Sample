package com.flowerencee9.marketplace.model.networking.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.model.data.objects.PlainItem
import com.flowerencee9.marketplace.model.data.response.ProfileData
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import com.flowerencee9.marketplace.support.base.BaseConstants.TEXT_VALUE_TYPE.Companion.VALUE_PHONE
import com.flowerencee9.marketplace.support.dummyUserData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserRepository @Inject constructor(private val service: KtorService, private val context: Context) {
    companion object {
        private val TAG = UserRepository::class.java.simpleName
    }

    private val _loadingStates: MutableLiveData<Boolean> = MutableLiveData()
    val loadingStates: LiveData<Boolean> get() = _loadingStates

    private val _statusResponse: MutableLiveData<StatusResponse> = MutableLiveData()
    val statusResponse: LiveData<StatusResponse> get() = _statusResponse

    private var _profileData : MutableLiveData<ProfileData> = MutableLiveData()
    val profileData : LiveData<ProfileData> get() = _profileData

    private var _listProfile : MutableLiveData<ArrayList<PlainItem>> = MutableLiveData()
    val listProfile : LiveData<ArrayList<PlainItem>> get() = _listProfile

    fun getDummyUser() {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            _profileData.value = dummyUserData()
            _listProfile.value = generateUserData(dummyUserData())
            delay(1000)
            _loadingStates.value = false
        }
    }

    private fun generateUserData(data: ProfileData): ArrayList<PlainItem> {
        val list = ArrayList<PlainItem>()
        with(context){
            list.add(PlainItem(getString(R.string.profile_name), data.name.toString() ))
            list.add(PlainItem(getString(R.string.profile_phone), data.phone.toString(), VALUE_PHONE ))
            list.add(PlainItem(getString(R.string.profile_email), data.email.toString() ))
            list.add(PlainItem(getString(R.string.profile_dob), data.dob.toString() ))
            list.add(PlainItem(getString(R.string.profile_address), data.address.toString() ))
        }
        return list
    }
}