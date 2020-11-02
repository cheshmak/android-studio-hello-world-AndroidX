package helloworld.sample.cheshmak.me.helloworld;

import android.app.Application;

import me.cheshmak.android.sdk.core.Cheshmak;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Cheshmak.with(MyApplication.this);
        Cheshmak.initTracker("90Ao+gH2iCPSXAV+aXCz3Q==");//don't forget to replace it with your own
    }
}
