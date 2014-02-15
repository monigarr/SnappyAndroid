package com.monigarr.snappyandroid;

import android.app.Application;

import com.parse.Parse;

public class SnappyAndroidApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "LGFstSvVx9KWsWyaUIvHN51AX727rP9Gi2nm1Vdp",
				"JsF0P2NXWceQDUdVgtHkK0aiQRmtpGau3CR8TotJ");
	}
}
