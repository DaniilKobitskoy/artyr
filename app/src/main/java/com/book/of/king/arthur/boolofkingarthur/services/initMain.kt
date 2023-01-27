package com.book.of.king.arthur.boolofkingarthur.services

import android.app.Application
import com.book.of.king.arthur.boolofkingarthur.gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs
import com.book.of.king.arthur.boolofkingarthur.keyStore.keyStoreMain.key
import com.onesignal.OneSignal
import org.json.JSONObject

class initMain: Application() {

    override fun onCreate() {
        super.onCreate()
        try {

            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(key.initOneSignal)
            OneSignal.setExternalUserId(gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs!!, object :
                OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(jsonObject: JSONObject) {

                }
                override fun onFailure(externalIdError: OneSignal.ExternalIdError) {

                }
            })





        }catch (e: Exception){

        }
    }
}