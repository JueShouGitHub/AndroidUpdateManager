package com.jues.updatelibrary.global;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Android Studio .
 * 作者：zhong
 * 日期：2018/2/5
 * 邮箱：15206394364@163.com
 * 介绍：
 * 修订：====================
 */

public class UpdateManagerConstants {
    //检测新版本
    public static final String VERSION = "version";
    public static final String NEW_APP_URL = "newVersionUrl";
    public static final String HAS_NEW_VERSION = "isHasNewVersion";

    /**
     * manifest文件下配置信息  versionName
     *
     * @param context
     * @return
     */
    private static String getVerName(Context context) {
        String verName = "";
        try {
            verName = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return verName;
    }

    /**
     * manifest文件下配置信息  versionCode
     *
     * @param context
     * @return
     */
    private static int getVerCode(Context context) {
        int verName = 0;
        try {
            verName = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return verName;
    }
}
