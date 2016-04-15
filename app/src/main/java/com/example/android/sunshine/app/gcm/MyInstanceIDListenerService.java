package com.example.android.sunshine.app.gcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by pc on 4/12/2016.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService{
    private static final String TAG = "MyInstanceIDLS";

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had not been compromised. This call is initiated by the
     * InstanceID provider.
     */
    @Override
    public void onTokenRefresh(){
        //Fetch updated Instance ID token
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);

    }

}