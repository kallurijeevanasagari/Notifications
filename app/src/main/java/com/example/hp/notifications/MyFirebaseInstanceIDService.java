package com.example.hp.notifications;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Hp on 03-May-17.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
 private static final String TAG="MyFirebaseInstanceIDService";
   @Override
    public void onTokenRefresh() {

       String refreshedToken = FirebaseInstanceId.getInstance().getToken();
       Log.d(TAG,"New Token:"+refreshedToken);

     //  sendRegistrationToServer(refreshedToken);

    }
}
