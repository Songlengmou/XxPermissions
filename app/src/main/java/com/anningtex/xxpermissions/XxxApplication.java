package com.anningtex.xxpermissions;

import android.app.Application;

import com.hjq.permissions.XXPermissions;

/**
 * @Author Song
 */
public class XxxApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 当前项目是否已经适配了分区存储的特性
        XXPermissions.setScopedStorage(true);
    }
}
