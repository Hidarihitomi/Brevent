package me.piebridge.brevent.ui;

import android.app.Application;

import java.util.UUID;

/**
 * Created by thom on 2017/2/7.
 */
public class BreventApplication extends Application {

    private UUID mToken;

    private boolean allowRoot;

    private boolean mSupportStopped = true;

    @Override
    public void onCreate() {
        super.onCreate();
        mToken = UUID.randomUUID();
    }

    public UUID getToken() {
        return mToken;
    }

    public void setAllowRoot() {
        allowRoot = true;
    }

    public boolean allowRoot() {
        return allowRoot;
    }

    public void setSupportStopped(boolean supportStopped) {
        if (mSupportStopped != supportStopped) {
            mSupportStopped = supportStopped;
        }
    }

    public boolean supportStopped() {
        return mSupportStopped;
    }

}
