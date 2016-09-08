package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * @author: JiangWeiwei
 * @time: 2016/8/30-15:20
 * @email: jiangweiwei@qccr.com
 * @desc:
 */
public class HostApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
        Small.setBaseUri("com.example.mysmall.app.");
    }
}
