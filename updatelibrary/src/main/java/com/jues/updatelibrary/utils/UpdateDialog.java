package com.jues.updatelibrary.utils;

import android.content.Context;

import com.flyco.dialog.widget.MaterialDialog;
import com.jues.updatelibrary.R;

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
        MaterialDialog dialog = new MaterialDialog(context).btnNum(2).title(title)
                .content(context.getResources().getString(R.string.find_new_version));
        dialog.setOnBtnClickL(dialog::dismiss, () -> {
            UpdateManager updateManager = new UpdateManager(context, apkUrl);
            updateManager.showDownloadDialog();
            dialog.dismiss();
        });
        dialog.show();
    }
}
