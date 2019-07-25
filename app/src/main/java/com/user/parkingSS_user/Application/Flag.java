package com.user.parkingSS_user.Application;

import android.app.Application;

public class Flag extends Application {

    private boolean flag;

    public Flag() {

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
