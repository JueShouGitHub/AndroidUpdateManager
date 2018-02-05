package com.jues.updatelibrary.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Android Studio .
 * 作者：zhong
 * 日期：2018/2/5
 * 邮箱：15206394364@163.com
 * 介绍：
 * 修订：====================
 */

public class UpdateDialog {
    public UpdateDialog(Context context, String title, String apkUrl) {
        UpdateManager updateManager = new UpdateManager(context, apkUrl);
        updateManager.showDownloadDialog();
//        new MaterialDialog.Builder(context).title(title).content(context.getResources().getString(R.string.find_new_version))
//        .onPositive((dialog, which) -> dialog.dismiss())
//        .onNegative((dialog, which) -> {
//            UpdateManager updateManager = new UpdateManager(context, apkUrl);
//            updateManager.showDownloadDialog();
//            dialog.dismiss();
//        })
//        .show();
    }
}
